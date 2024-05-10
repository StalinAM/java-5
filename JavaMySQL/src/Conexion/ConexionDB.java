package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {

	public static Connection getConnection() {

		String url = "jdbc:mysql://localhost:3306/employees";
		String usuario = "root";
		String contrasenia = "root";

		Connection connection = null;

		if (connection == null) {
			try {
				connection = DriverManager.getConnection(url, usuario, contrasenia);
				boolean valid = connection.isValid(5000);
				System.out.println(valid ? "Connection realizada" : "Connection fallida");
			} catch (java.sql.SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return connection;
	}
}
