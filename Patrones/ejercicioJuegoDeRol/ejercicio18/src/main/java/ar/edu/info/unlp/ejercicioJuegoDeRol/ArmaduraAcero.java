package ar.edu.info.unlp.ejercicioJuegoDeRol;

public class ArmaduraAcero implements Armadura{

	@Override
	public int pelearContra(Arma arma) {
		return arma.pelearContraArmaduraAcero();
	}
	
}
