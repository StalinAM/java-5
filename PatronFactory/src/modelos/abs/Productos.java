package modelos.abs;

public abstract class Productos {

	private String fechaCaducidad;
	private int numLote;
	private String fechaEnvasado;
	private String paisOrigen;

	public Productos(String fechaCaducidad, int numLote, String fechaEnvasado, String paisOrigen) {
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = numLote;
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public abstract void imprimir();

	protected void imprimirGeneral() {
		System.out.println("Fecha Envasado: " + fechaEnvasado);
		System.out.println("Lote: " + numLote);
		System.out.println("Pais: " + paisOrigen);
		System.out.println("Fecha caducidad: " + fechaCaducidad);
	}

}
