package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Llamada {
	private String origen;
	private String destino;
	private int duracion;
	private TipoLlamada tipoLlamada;

	public Llamada(TipoLlamada tipoLlamada, String origen, String destino, int duracion) {
		this.origen= origen;
		this.destino= destino;
		this.duracion = duracion;
		this.tipoLlamada = tipoLlamada;
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
	
	public double calcularPecio(double iva)
	{
		return this.tipoLlamada.calcularPrecio(this.duracion, iva);
	}
}
