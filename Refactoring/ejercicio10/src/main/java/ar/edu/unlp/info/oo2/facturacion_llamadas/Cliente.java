package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private TipoCliente tipo;
	private String nombre;
	private String numeroTelefono;
	private String cuit;
	private String dni;
	
	public Cliente(String nombre, TipoCliente tipo, String numeroTelefono)
	{
		this.nombre = nombre;
		this.tipo =  tipo;
		this.numeroTelefono = numeroTelefono;
	}
	
	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getDNI() {
		return dni;
	}
	public void setDNI(String dni) {
		this.dni = dni;
	}
	
	public List<Llamada> getLlamadas()
	{
		return this.llamadas;
	}
	
	public void agregarLlamada(Llamada llamada) 
	{
		this.llamadas.add(llamada);
	}
	
	public double calcularTotalLlamadas(double iva)
	{
		double total = this.llamadas.stream().mapToDouble(l -> l.calcularPecio(iva)).sum();
		return this.tipo.aplicarDescuento(total);
	}
}
