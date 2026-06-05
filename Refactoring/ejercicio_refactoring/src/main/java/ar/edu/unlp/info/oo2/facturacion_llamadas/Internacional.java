package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Internacional implements TipoLlamada{
	static double precioInternacional = 150;
	static double extraInternacional = 50;
	

	public double calcularPrecio(int duracion, double iva)
	{
		return duracion * precioInternacional + (duracion * precioInternacional * iva) + extraInternacional;
	}
}
