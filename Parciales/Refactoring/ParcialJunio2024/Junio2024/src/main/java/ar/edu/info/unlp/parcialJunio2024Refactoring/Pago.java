package ar.edu.info.unlp.parcialJunio2024Refactoring;

import java.util.List;

public class Pago {
	private List<Producto> productos;
	private TipoDePago tipo;
	
	
	public Pago(TipoDePago tipo, List<Producto> productos) {
		this.productos = productos;
		this.tipo = tipo;
	}
	
	protected double calcularTotal()
	{
		return this.productos.stream().mapToDouble(p -> p.calcularPrecio()).sum();
	}
	
	public double calcularMontoFinal()
	{
		return this.tipo.calcularPago(this.calcularTotal());
	}
	
	
}
