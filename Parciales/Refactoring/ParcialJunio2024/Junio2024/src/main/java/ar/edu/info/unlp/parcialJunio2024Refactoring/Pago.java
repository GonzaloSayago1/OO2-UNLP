package ar.edu.info.unlp.parcialJunio2024Refactoring;

import java.util.List;

public class Pago {
	private List<Producto> productos;
	private TipoDePago tipo;
	
	private static final double ADICIONAL_TARJETA = 1000.0; 
	private static final double DESCUENTO_EFECTIVO = 2000.0;
	
	public Pago(TipoDePago tipo, List<Producto> productos) {
		this.productos = productos;
		this.tipo = tipo;
	}
	
	protected double calcularTotal()
	{
		return this.productos.stream().mapToDouble(p -> p.calcularPrecio()).sum();
	}
	
	public double calcularMontoFinalEfectivo()
	{
		double total = this.calcularTotal();
		if(total > 100000)
			total = this.tipo.calcularPago(total, DESCUENTO_EFECTIVO);
		return total ;
	}
	
	public double calcularMontoFinalTarjeta()
	{
		return this.tipo.calcularPago(this.calcularTotal(), ADICIONAL_TARJETA);
	}
	
}
