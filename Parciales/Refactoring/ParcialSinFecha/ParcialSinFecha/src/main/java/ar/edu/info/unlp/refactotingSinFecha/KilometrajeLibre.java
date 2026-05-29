package ar.edu.info.unlp.refactotingSinFecha;

public class KilometrajeLibre implements TipoRenta{
	public double calcularTotal(Vehiculo vehiculo, int diasRenta, int kilometros)
	{
		return vehiculo.calcularPrecioDia(diasRenta);
	}
}
