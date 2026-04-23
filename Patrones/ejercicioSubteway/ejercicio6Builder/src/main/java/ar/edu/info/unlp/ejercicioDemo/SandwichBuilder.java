package ar.edu.info.unlp.ejercicioDemo;

public abstract class SandwichBuilder {
	protected Sandwich sandwich;
	
	public void crearSandwich()
	{
		this.sandwich = new Sandwich();
	}
	
	public Sandwich getSanwich()
	{
		return this.sandwich;
	}
	
	protected abstract void precioPan();
	protected abstract void precioAderezo();
	protected abstract void precioPrincipal();
	protected abstract void precioAdicional();
}
