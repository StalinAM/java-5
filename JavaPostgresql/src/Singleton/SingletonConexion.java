package Singleton;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class SingletonConexion {
	private static SingletonConexion instancia = null;
	private static Properties p;

	private SingletonConexion() {
		p = new Properties();
		try {
			p.load(new FileInputStream(new File("D:\\Documentos\\Java5to\\JavaPostgresql\\src\\Singleton\\base.properties")));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static SingletonConexion getInstancia() {
		if (instancia == null) {
			instancia = new SingletonConexion();
			System.out.println("Se a creado una intancia");
		} else {
			System.out.println("se ha devuelto la instancia");
		}
		return instancia;
	}

	public String getProperties(String clave) {
		return p.getProperty(clave);
	}

}
