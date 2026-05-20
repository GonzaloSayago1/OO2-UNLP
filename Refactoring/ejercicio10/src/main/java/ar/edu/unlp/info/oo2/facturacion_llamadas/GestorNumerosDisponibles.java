 package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<String>();
	private Numero generador = new Ultimo();

	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {//Mal olor por preguntar por el tipo
		return this.generador.obtenerNumero(lineas);
	}

	public void cambiarTipoGenerador(Numero generador) {
		this.generador = generador;
	}
}
