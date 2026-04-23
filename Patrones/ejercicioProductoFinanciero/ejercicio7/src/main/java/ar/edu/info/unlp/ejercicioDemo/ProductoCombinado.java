package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class ProductoCombinado implements ProductoFinanciero{
	private List<ProductoFinanciero> productos;
	
	public ProductoCombinado()
	{
		this.productos = new ArrayList<ProductoFinanciero>();
	}
	
	public void agregarProducto(ProductoFinanciero p)
	{
		this.productos.add(p);
	}
	
	public double retornoInversion(double monto)
	{
		return this.productos.stream().mapToDouble(p -> p.retornoInversion(monto)).sum();
	}
}
