package Principal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import ClasesBean.EmployeesBean;
import Conexion.CRUD;
import Conexion.ConexionDB;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<EmployeesBean> allEmployees = CRUD.readAllProducts();
//		for (EmployeesBean employee : allEmployees) {
//			System.out.println(employee);
//		}
		long startTime = System.currentTimeMillis();
		// Your code to execute (the block you want to measure)
		final String TABLE_NAME = "employees";
		int count = 0;
		try (Connection connection = ConexionDB.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement
						.executeQuery("Select e.first_name, e.last_name, s.salary, d.dept_name\r\n"
								+ "from employees e, salaries s, dept_emp dep, departments d\r\n"
								+ "where s.emp_no = e.emp_no and e.emp_no = dep.emp_no and dep.dept_no = d.dept_no;")) {
			while (resultSet.next()) {
				count++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(count);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		double executionTimeInSeconds = (double) executionTime / 1000;
		System.out.println("Tiempo de ejecucion: " + executionTimeInSeconds + " seconds");

	}

}
