package Principal;

import java.util.List;

import ClasesBean.EmployeesBean;
import Conexion.CRUD;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeesBean> allEmployees = CRUD.readAllProducts();
		for (EmployeesBean employee : allEmployees) {
			System.out.println(employee);
		}
	}

}
