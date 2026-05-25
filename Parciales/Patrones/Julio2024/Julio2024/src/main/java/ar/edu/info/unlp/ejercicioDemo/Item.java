package ar.edu.info.unlp.ejercicioDemo;

public abstract class Item {
	private int espacio;
	private String nombre;

	public Item(int espacio, String nombre) {
		this.espacio = espacio;
		this.nombre = nombre;
	}

	protected int getEspacio() {
		return espacio;
	}
	
	protected String getNombre()
	{
		return this.nombre;
	}
	
	protected abstract boolean tieneEspacio(int espacio);
	public abstract boolean agregarALaBolsa(Item item);
	public abstract Item buscarPorNombre(String nombre);
	public abstract int espacioDisponible();
	protected abstract int calcularEspacio();
}
