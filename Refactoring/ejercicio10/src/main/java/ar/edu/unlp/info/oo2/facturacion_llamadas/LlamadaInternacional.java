package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {
	private double precioAdicional;

	public LlamadaInternacional(String origen, String destino, int duracion, double precio, double adicional) {
		super(origen, destino, duracion, precio);
		this.precioAdicional = adicional;
	}

	@Override
	protected double sumarAdicional()
	{
		return this.precioAdicional;
	}
}
