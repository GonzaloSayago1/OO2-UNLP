package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada{

	public LlamadaNacional(String origen, String destino, int duracion, double precio) {
		super(origen, destino, duracion, precio);
	}

	@Override
	protected double sumarAdicional() {
		return 0;
	}
}
