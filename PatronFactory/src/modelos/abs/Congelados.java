package modelos.abs;

public class Congelados extends Productos {

	private int temperatura;

	public Congelados(String fechaCaducidad, int numLote, String fechaEnvasado, String paisOrigen, int temperatura) {
		super(fechaCaducidad, numLote, fechaEnvasado, paisOrigen);
		// TODO Auto-generated constructor stub
		this.temperatura = temperatura;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public void imprimir() {
		imprimirGeneral();
		System.out.println("Temperatura: " + temperatura);
	}

}
