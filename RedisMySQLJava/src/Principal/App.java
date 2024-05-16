package Principal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import SQL.ConexionDB;
import redis.clients.jedis.Jedis;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jedis pool = new Jedis("localhost", 6379);
		long startTime = System.currentTimeMillis();
		if (pool.get("datos") != null) {
			System.out.println("Existe esa clave!");
		} else {
			int count = 0;
			StringBuilder datos = new StringBuilder();
			try (Connection connection = ConexionDB.getConnection();
					Statement statement = connection.createStatement();
					ResultSet resultSet = statement
							.executeQuery("Select e.first_name, e.last_name, s.salary, d.dept_name\r\n"
									+ "from employees e, salaries s, dept_emp dep, departments d\r\n"
									+ "where s.emp_no = e.emp_no and e.emp_no = dep.emp_no and dep.dept_no = d.dept_no;")) {
				while (resultSet.next()) {
					java.sql.ResultSetMetaData rsmd = resultSet.getMetaData();
					count++;
					for (int i = 1; i <= rsmd.getColumnCount(); i++) {
						datos.append(resultSet.getString(i));
					}
				}
				pool.set("datos", datos.toString());

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				pool.close();
			}
			System.out.println(count);

		}
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		double executionTimeInSeconds = (double) executionTime / 1000;
		System.out.println("Tiempo de ejecucion: " + executionTimeInSeconds + " seconds");
	}
}
