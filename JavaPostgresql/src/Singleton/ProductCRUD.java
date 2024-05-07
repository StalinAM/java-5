package Singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ProductCRUD {

	private static final String TABLE_NAME = "productos";

	// CREAR PRODUCTO
	public static void createProduct(Producto producto) {
		// USO TRY WITH RESOURCES
		// La conexion a la base de datos se cierra automaticamente al terminar
		try (Connection connection = ConexionBase.getConnection();
				PreparedStatement statement = connection
						.prepareStatement("INSERT INTO " + TABLE_NAME + " (nombre, cantidad) VALUES (?, ?)")) {
			statement.setString(1, producto.getNombre());
			statement.setInt(2, producto.getCantidad());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Producto> readAllProducts() {
		List<Producto> products = new ArrayList<>();
		try (Connection connection = ConexionBase.getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TABLE_NAME)) {
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nombre = resultSet.getString("nombre");
				int cantidad = resultSet.getInt("cantidad");

				Producto product = new Producto(nombre, cantidad);
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}

}
