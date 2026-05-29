package ar.edu.info.unlp.refactotingSinFecha;

public class Plus implements TipoRenta{
	public double calcularTotal(Vehiculo vehiculo, int diasRenta, int kilometros)
	{
		return vehiculo.calculaPrecioKilometro(kilometros);
	}
}
