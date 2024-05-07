package Singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto producto1 = new Producto("mesa", 2);
		ProductCRUD.createProduct(producto1);
	}

}
