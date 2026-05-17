package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	static double descuentoJur = 0.15;
	static double descuentoFis = 0;
	static double precioLlamadaNacional = 3;
	static double precioLlamadaInternacional = 150;
	static double adicionalInternacional = 50;

	public boolean agregarNumeroTelefono(String str) {
	    if (!guia.getLineas().contains(str)) {
	        guia.getLineas().add(str);
	        return true;
	    }
	    return false;
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}
	
	public ClienteFisico registrarClienteFisico(String data, String nombre)
	{
		ClienteFisico cliente = new ClienteFisico();
		cliente.setNombre(nombre);
		cliente.setNumeroTelefono(this.obtenerNumeroLibre());
		cliente.setDni(data);
		cliente.setDescuento(descuentoFis);
		this.clientes.add(cliente);
		return cliente;
	}
	
	public ClienteJuridico registrarClienteJuridico(String data, String nombre)
	{
		ClienteJuridico cliente = new ClienteJuridico();
		cliente.setNombre(nombre);
		cliente.setNumeroTelefono(this.obtenerNumeroLibre());
		cliente.setCuit(data);
		cliente.setDescuento(descuentoJur);
		this.clientes.add(cliente);
		return cliente;
	}

	private void agregarLlamanda(Llamada llamada)
	{
		this.llamadas.add(llamada);
	}
	
	public Llamada registrarLlamadaInternacional(Cliente origen, Cliente destino, int duracion) {
		Llamada llamada = new LlamadaInternacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion, this.precioLlamadaInternacional, this.adicionalInternacional);
		llamadas.add(llamada);
		origen.agregarLLamada(llamada);
		return llamada;
	}
	
	public Llamada registrarLlamadaNacional(Cliente origen, Cliente destino, int duracion) {
		Llamada llamada = new LlamadaNacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion, this.precioLlamadaNacional);
		llamadas.add(llamada);
		origen.agregarLLamada(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
	    return cliente.getLlamadas().stream()
	        .mapToDouble(l -> cliente.aplicarDescuento(l.calcularPrecio()))
	        .sum();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
