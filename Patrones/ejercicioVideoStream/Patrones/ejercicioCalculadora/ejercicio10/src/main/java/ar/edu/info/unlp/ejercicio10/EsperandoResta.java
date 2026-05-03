package ar.edu.info.unlp.ejercicio10;

public class EsperandoResta extends EstadoCalculo{
	protected double realizarCalculo(double resultado, double unValor)
	{
		return resultado - unValor;
	}
	
	protected boolean huboError(double unValor) 
	{
		return false;	
	}
}
