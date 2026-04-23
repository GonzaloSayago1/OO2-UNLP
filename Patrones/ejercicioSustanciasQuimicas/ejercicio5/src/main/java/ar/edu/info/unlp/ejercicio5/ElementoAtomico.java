package ar.edu.info.unlp.ejercicio5;

public class ElementoAtomico extends ElementoQuimico{
	private int pesoAtomico;
	private int cargaElectrica;
	private boolean esMetal;
	private String simbolo;
	
	public ElementoAtomico(String simbolo, int pesoAtomico, int cargaElectrica, boolean esMetal) {
		this.pesoAtomico = pesoAtomico;
		this.cargaElectrica = cargaElectrica;
		this.esMetal = esMetal;
		this.simbolo = simbolo;
	}
	
	public double pesoAtomico() 
	{
		return this.pesoAtomico;
	}
	
	public  double cargaElectrica()
	{
		return this.cargaElectrica;
	}
	
	public boolean esMetal()
	{
		return this.esMetal;
	}
	
	public String getFormula()
	{
		return this.simbolo;
	}
	
	public boolean esValida()
	{
		return true;
	}
	
	
}
