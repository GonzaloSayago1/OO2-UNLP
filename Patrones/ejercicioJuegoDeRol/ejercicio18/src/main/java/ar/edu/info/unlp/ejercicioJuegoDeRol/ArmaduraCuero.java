package ar.edu.info.unlp.ejercicioJuegoDeRol;

public class ArmaduraCuero implements Armadura{

	@Override
	public int pelearContra(Arma arma) {
		return arma.pelearContraArmaduraCuero();
	}
}
