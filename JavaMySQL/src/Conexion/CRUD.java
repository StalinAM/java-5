package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ClasesBean.EmployeesBean;

public class CRUD {
	private static final String TABLE_NAME = "employees";

	// CREAR PRODUCTO

	public static List<EmployeesBean> readAllProducts() {
		List<EmployeesBean> employees = new ArrayList<>();
		try (Connection connection = ConexionDB.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TABLE_NAME )) {
			while (resultSet.next()) {

				int emp_no = resultSet.getInt("emp_no");
				String first_name = resultSet.getString("first_name");
				String birth_date = resultSet.getString("birth_date");
				String last_name = resultSet.getString("last_name");
				char gender = resultSet.getString("gender").charAt(0);
				String hire_date = resultSet.getString("hire_date");

				EmployeesBean employe = new EmployeesBean(emp_no, first_name, birth_date, last_name, gender, hire_date);
				employees.add(employe);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}
}
