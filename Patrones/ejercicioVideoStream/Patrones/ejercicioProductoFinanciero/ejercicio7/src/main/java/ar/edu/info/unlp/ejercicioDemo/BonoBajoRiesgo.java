package ar.edu.info.unlp.ejercicioDemo;

public class BonoBajoRiesgo extends Bono{

	public BonoBajoRiesgo() {

	}

	@Override
	protected double obtenerVariacionMaxima() {
		return 0.1;
	}
	
}
