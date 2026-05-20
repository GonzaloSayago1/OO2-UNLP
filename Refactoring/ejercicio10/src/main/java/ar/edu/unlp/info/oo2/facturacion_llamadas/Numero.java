package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;

public abstract class Numero {
	public String obtenerNumeroLibre(SortedSet<String> lineas)
	{
		String linea = this.obtenerNumero(lineas);
		lineas.remove(linea);
		return linea;
	}
	
	protected abstract String obtenerNumero(SortedSet<String> lineas);
}
