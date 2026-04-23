package ar.edu.info.unlp.ejercicio5;

public abstract class ElementoQuimico {
	public abstract double pesoAtomico();
	public abstract double cargaElectrica();
	public abstract boolean esMetal();
	
	public boolean noEsMetal()
	{
		return !this.esMetal();
	}
	
	public abstract String getFormula();
	
	public abstract boolean esValida();
}
