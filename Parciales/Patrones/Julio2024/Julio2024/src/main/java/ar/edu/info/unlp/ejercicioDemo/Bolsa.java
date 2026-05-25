package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Bolsa extends Item{
	private int capacidad;
	private List<Item> items;
	
	public Bolsa(int espacio, String nombre, int capacidad) {
		super(espacio, nombre);
		this.capacidad = capacidad;
		this.items = new ArrayList<Item>();
	}
	
	@Override
	public boolean tieneEspacio(int espacio) {
		return (this.items.size() + espacio) < this.capacidad;
	}
	
	public boolean agregarALaBolsa(Item item)
	{
		if(this.tieneEspacio(item.getEspacio()))
		{
			this.items.add(item);
			return true;
		} else 
		{
			return this.items.stream()
				    .anyMatch(i -> i.agregarALaBolsa(item));
		}
	}
	
	@Override
	public Item buscarPorNombre(String nombre)
	{
		if(this.getNombre().equals(nombre))
		{
			return this;
		}
		return this.items.stream().map(i -> i.buscarPorNombre(nombre)).findFirst().orElse(null);//Preguntar si tengo que filtrar nulls primero
	}
	
	@Override
	protected int calcularEspacio()
	{
		return this.capacidad - this.items.size();
	}
	
	@Override
	public int espacioDisponible() {
	    int espacioPropio = this.calcularEspacio();
	    int espacioInterno = this.items.stream()
	        .mapToInt(i -> i.espacioDisponible())
	        .max()
	        .orElse(0);
	    return Math.max(espacioPropio, espacioInterno);
	}
	
	public int capacidadTotal()
	{
		return this.items.stream().mapToInt(i -> i.calcularEspacio()).sum();
	}
}
