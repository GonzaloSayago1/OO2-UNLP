package ar.edu.info.unlp.ejercicioDemo;

import java.util.Random;

public class BonoAltoRiesgo extends Bono{

	public BonoAltoRiesgo() {
		super();
	}

	@Override
	protected double obtenerVariacionMaxima() {
		
		return 0.7;
	}

}
