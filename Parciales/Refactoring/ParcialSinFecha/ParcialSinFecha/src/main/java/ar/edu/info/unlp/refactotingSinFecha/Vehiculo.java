package ar.edu.info.unlp.refactotingSinFecha;

public class Vehiculo {
	public double getPrecioDia()
	{
		return 0;
	}
	
	public int getKilometraje()
	{
		return 0;
	}
	
	public int getAntiguedad()
	{
		return 0;
	}
	
	public double getPrecioPorKm()
	{
		return 0;
	}
	
	public void aumentarKilometraje(int cantidadKM)
	{
	}
	
	protected double calculaPrecioKilometro(int kilometros)
	{
		return kilometros * this.getPrecioPorKm();
	}
	
	protected double calcularPrecioDia(int diasRenta)
	{
		return diasRenta * this.getPrecioDia();
	}
}
