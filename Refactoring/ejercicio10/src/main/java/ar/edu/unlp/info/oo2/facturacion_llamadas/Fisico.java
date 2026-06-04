package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Fisico implements TipoCliente{
	static double descuentoFis = 0;
	@Override
	public double aplicarDescuento(double monto) {
		return monto - descuentoFis;
	}
	
}
