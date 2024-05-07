package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

public class ConexionBase {
	private static DataSource dataSource = null;

	public static Connection getConnection() {
		SingletonConexion pro = SingletonConexion.getInstancia();

//		String url = "jdbc:postgresql://localhost:5432/ejercicio";
//		String usuario = "postgres";
//		String contrasenia = "labcom,2015";
		String url = pro.getProperties("url");
		String usuario = pro.getProperties("usuario");
		String contrasenia = pro.getProperties("password");

		Connection connection = null;

		if (connection == null) {
			try {
				try {
					Class.forName(pro.getProperties("driver"));
					System.out.println("Se registro correctamente el driver");
				} catch (ClassNotFoundException ex) {
					// TODO: handle exception
					System.out.println("No se registro el driver");
				}
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
