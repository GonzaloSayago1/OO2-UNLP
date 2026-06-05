package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Nacional implements TipoLlamada{
	static double precioNacional = 3;
	
	public double calcularPrecio(int duracion, double iva)
	{
		return duracion * precioNacional + (duracion * precioNacional * iva);
	}
}
