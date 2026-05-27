package ar.edu.info.unlp.parcialJunio2024Refactoring;

public class TipoDePagoTarjeta implements TipoDePago{
	@Override
	public double calcularPago(double total, double extra) {
		return total + extra;
	}
}
