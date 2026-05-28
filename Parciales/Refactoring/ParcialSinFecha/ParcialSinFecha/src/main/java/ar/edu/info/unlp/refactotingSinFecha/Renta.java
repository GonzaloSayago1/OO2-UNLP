package ar.edu.info.unlp.refactotingSinFecha;

public class Renta {
	private Vehiculo vehiculo;
	private Cliente cliente;
	private int diasRenta;
	private String tipoRenta;
	private int kilometrajeInicial;
	
	public Renta(Vehiculo vehiculo, Cliente cliente, int diasRenta) {
		this.vehiculo = vehiculo;
		this.cliente = cliente;
		this.diasRenta = diasRenta;
		this.kilometrajeInicial = vehiculo.getKilometraje();
		this.tipoRenta = "BASICO";
	}

	public void setTipoRenta(String tipoRenta) {
		this.tipoRenta = tipoRenta;
	}
	
	protected int kilometrosRecorridos()//Preguntar
	{
		return vehiculo.getKilometraje() - this.kilometrajeInicial;
	}
	
	public double calcularTotal()
	{
		if(this.tipoRenta == "BASICO")
		{
			double precio = diasRenta * vehiculo.getPrecioDia() + this.kilometrosRecorridos() * 
					vehiculo.getPrecioPorKm();
			double adicional = 1;
			//Los autos más viejos tirnen un 15% de descuento
			if(vehiculo.getAntiguedad() > 5)
				adicional = 0.85;
			return precio * adicional;
		}
		else if (this.tipoRenta == "PLUS") 
		{
			//int kilometrosRecorridos = vehiculo.getKilometraje() - this.kilometrajeInicial;
			return this.kilometrosRecorridos() * vehiculo.getPrecioDia();
		}
		else 
			return diasRenta * vehiculo.getPrecioDia(); 
	}
}
