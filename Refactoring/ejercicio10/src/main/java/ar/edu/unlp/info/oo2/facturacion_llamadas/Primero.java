package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

public class Primero extends Numero{

	@Override
	protected String obtenerNumero(SortedSet<String> lineas) {
		return lineas.first();
	}

}
