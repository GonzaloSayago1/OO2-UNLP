package ar.edu.info.unlp.refactotingSinFecha;

public class Basico implements TipoRenta{
	public double calcularTotal(Vehiculo vehiculo, int diasRenta, int kilometros)
	{
		double precio = vehiculo.calcularPrecioDia(diasRenta) + vehiculo.calculaPrecioKilometro(kilometros);
		double adicional = 1;
		if(vehiculo.getAntiguedad() > 5)
			adicional = 0.85;
		return precio * adicional;
	}
}
