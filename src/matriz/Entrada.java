package matriz;

public class Entrada {
	
	private int filas;
	private int columnas;
	
	
	public Entrada() {
		super();
	}
	public int getFilas() {
		return filas;
	}
	public void setFilas(int filas) {
		this.filas = filas;
	}
	public int getColumnas() {
		return columnas;
	}
	public Entrada(int filas, int columnas) {
		super();
		this.filas = filas;
		this.columnas = columnas;
	}
	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	
	

}
