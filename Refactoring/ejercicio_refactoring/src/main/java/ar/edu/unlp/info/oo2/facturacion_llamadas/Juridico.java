package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class Juridico implements TipoCliente{
	static double descuentoJur = 0.15;
	@Override
	public double aplicarDescuento(double monto) {
		return monto - (monto - descuentoJur);
	}

}
