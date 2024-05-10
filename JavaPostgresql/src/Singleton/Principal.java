package Singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Producto producto1 = new Producto("mesa", 2);
		//ProductCRUD.createProduct(producto1);
		List<Producto> allProducts = ProductCRUD.readAllProducts();
		for (Producto product : allProducts) {
		    System.out.println(product);
		}
	}

}
