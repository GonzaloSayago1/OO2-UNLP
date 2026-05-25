package ar.edu.info.unlp.ejercicioDemo;

public class Jugador {
	private String nombre;
	private Bolsa bolsa;
	
	public Jugador(String nombre, Bolsa bolsa) {
		this.nombre = nombre;
		this.bolsa = bolsa;
	}
	
	public boolean guardarItem(Item item)
	{
		return this.bolsa.agregarALaBolsa(item);
	}
	
	public Item buscarPorNombre(String nombre)
	{
		return this.bolsa.buscarPorNombre(nombre);
	}
	
	public int espacioMaximo()
	{
		return this.bolsa.espacioDisponible();
	}
	
	public int capacidadTotal()
	{
		return this.bolsa.capacidadTotal();
	}
}
