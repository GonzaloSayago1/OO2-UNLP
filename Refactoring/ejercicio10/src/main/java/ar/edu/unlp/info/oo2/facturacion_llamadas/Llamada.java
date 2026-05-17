package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private String origen;
	private String destino;
	private int duracion;
	private double precio;

	public Llamada(String origen, String destino, int duracion, double precio) {
		this.origen= origen;
		this.destino= destino;
		this.duracion = duracion;
		this.precio = precio;
	}

	public String getRemitente() {
		return destino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getOrigen() {
		return origen;
	}
	
	public double calcularPrecio()
	{
		return this.getDuracion() * this.precio + (this.getDuracion() * this.precio * 0.21) + this.sumarAdicional();
	}
	
	protected abstract double sumarAdicional();
}
