package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();
	
	static double IVA = 0.21;

	public boolean agregarNumeroTelefono(String str) {
		boolean encontre = guia.getLineas().contains(str);
		if (!encontre) {
			guia.getLineas().add(str);
			encontre= true;
			return encontre;
		}
		else {
			encontre= false;
			return encontre;
		}
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}
	
	public Cliente RegistrarUsuarioFisico(String data, String nombre, TipoCliente tipo)
	{
		Cliente cliente = new Cliente(nombre, tipo, this.obtenerNumeroLibre());
		cliente.setDNI(data);
		clientes.add(cliente);
		return cliente;
	}
	
	public Cliente RegistrarUsuarioJuridico(String data, String nombre, TipoCliente tipo)
	{
		Cliente cliente = new Cliente(nombre, tipo, this.obtenerNumeroLibre());
		cliente.setCuit(data);
		clientes.add(cliente);
		return cliente;
	}

	public Llamada registrarLlamada(Cliente origen, Cliente destino, TipoLlamada tipoLlamada, int duracion) {
		Llamada llamada = new Llamada(tipoLlamada, origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		llamadas.add(llamada);
		origen.agregarLlamada(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.calcularTotalLlamadas(IVA);
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
