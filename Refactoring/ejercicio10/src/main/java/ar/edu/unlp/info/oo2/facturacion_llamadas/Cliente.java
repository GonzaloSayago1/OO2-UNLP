package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	private List<Llamada> llamadas = new ArrayList<Llamada>();//Mal olor, atributo publico
	private String nombre;
	private String numeroTelefono;
	private double descuento;
	
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
	
	protected void agregarLLamada(Llamada llamada)
	{
		this.llamadas.add(llamada);
	}
	
	protected List<Llamada> getLlamadas()
	{
		return this.llamadas;
	}
	
	protected void setDescuento(double descuento)
	{
		this.descuento = descuento;
	}
	
	public double aplicarDescuento(double monto)
	{
		return monto - (monto * this.descuento);
	}
}
