package Singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductCRUD {

	private static final String TABLE_NAME = "productos";

	// CREAR PRODUCTO
	public static void createProduct(Producto producto) {
		//USO TRY WITH RESOURCES
		//La conexion a la base de datos se cierra automaticamente al terminar
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

	
	
}
