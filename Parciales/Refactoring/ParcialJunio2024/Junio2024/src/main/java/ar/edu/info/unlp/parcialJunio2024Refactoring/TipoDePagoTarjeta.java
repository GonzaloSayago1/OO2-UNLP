package ar.edu.info.unlp.parcialJunio2024Refactoring;

public class TipoDePagoTarjeta implements TipoDePago{
	private static final double ADICIONAL_TARJETA = 1000.0;
	@Override
	public double calcularPago(double total) {
		return total + this.ADICIONAL_TARJETA;
	}
}
