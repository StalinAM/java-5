package modelos;

import modelos.abs.Productos;

public class PodructosRefrigerados extends Productos {
	private String codigoOSA;
	private String fechaEnvasado;
	private int temperaturaRecom;

	public String getCodigoOSA() {
		return codigoOSA;
	}

	public void setCodigoOSA(String codigoOSA) {
		this.codigoOSA = codigoOSA;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public int getTemperaturaRecom() {
		return temperaturaRecom;
	}

	public void setTemperaturaRecom(int temperaturaRecom) {
		this.temperaturaRecom = temperaturaRecom;
	}

}
