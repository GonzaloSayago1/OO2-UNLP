package ar.edu.info.unlp.ejercicioDemo;

public class ItemUnitario extends Item{

	public ItemUnitario(int espacio, String nombre) {
		super(espacio, nombre);
	}

	@Override
	protected boolean tieneEspacio(int espacio) {
		return false;
	}

	@Override
	public boolean agregarALaBolsa(Item item) {
		return false;
	}

	@Override
	public Item buscarPorNombre(String nombre) {
		if(this.getNombre().equals(nombre))
			return this;
		return null;	
	}
	
	@Override
	public int espacioDisponible()
	{
		return 0;
	}
	
	@Override
	protected int calcularEspacio()
	{
		return 0;
	}
}
