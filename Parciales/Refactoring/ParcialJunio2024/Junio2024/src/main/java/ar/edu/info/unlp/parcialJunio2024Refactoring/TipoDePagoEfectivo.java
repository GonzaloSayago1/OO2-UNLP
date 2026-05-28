package ar.edu.info.unlp.parcialJunio2024Refactoring;

public class TipoDePagoEfectivo implements TipoDePago{
	private static final double DESCUENTO_EFECTIVO = 2000.0;
	@Override
	public double calcularPago(double total) {
		if(total > 100000) {
			return total - this.DESCUENTO_EFECTIVO;
		}
		return total;
	}
}
