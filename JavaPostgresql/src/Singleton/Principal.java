package Singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import clasesBean.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto producto1 = new Producto(3, "camas", 5);
//		ProductCRUD.createProduct(producto1);
		ProductCRUD.updateProduct(producto1);
//		ProductCRUD.deleteProduct(2);
//		List<Producto> allProducts = ProductCRUD.readAllProducts();
//		for (Producto product : allProducts) {
//		    System.out.println(product);
//		}
	}

}
