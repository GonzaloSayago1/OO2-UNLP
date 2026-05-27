package ar.edu.info.unlp.parcialJunio2024Refactoring;

public class Producto {
	private double precio;
	private double IVA;
	
	public Producto(double precio, double iVA) {
		this.precio = precio;
		IVA = iVA;
	}

	public double getPrecio() {
		return precio;
	}

	public double getIVA() {
		return IVA;
	}
	
	public double calcularPrecio()
	{
		return this.precio + (this.precio * this.IVA);
	}
}
