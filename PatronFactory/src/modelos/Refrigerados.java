package modelos;

import modelos.abs.Productos;

public class Refrigerados extends Productos {
	private String codigoOSA;
	private int temperaturaRecom;

	public String getCodigoOSA() {
		return codigoOSA;
	}

	public void setCodigoOSA(String codigoOSA) {
		this.codigoOSA = codigoOSA;
	}

	public int getTemperaturaRecom() {
		return temperaturaRecom;
	}

	public void setTemperaturaRecom(int temperaturaRecom) {
		this.temperaturaRecom = temperaturaRecom;
	}

}
