package ar.edu.info.unlp.refactotingSinFecha;

public class Renta {
	private Vehiculo vehiculo;
	private Cliente cliente;
	private int diasRenta;
	private TipoRenta tipoRenta;
	private int kilometrajeInicial;
	
	public Renta(Vehiculo vehiculo, Cliente cliente, int diasRenta) {
		this.vehiculo = vehiculo;
		this.cliente = cliente;
		this.diasRenta = diasRenta;
		this.kilometrajeInicial = vehiculo.getKilometraje();
		this.tipoRenta = new Basico();
	}

	public void setTipoRenta(TipoRenta tipoRenta) {
		this.tipoRenta = tipoRenta;
	}
	
	protected int kilometrosRecorridos()
	{
		return vehiculo.getKilometraje() - this.kilometrajeInicial;
	}
	
	public double calcularTotal()
	{
		return this.tipoRenta.calcularTotal(vehiculo, diasRenta, this.kilometrosRecorridos());
	}
}
