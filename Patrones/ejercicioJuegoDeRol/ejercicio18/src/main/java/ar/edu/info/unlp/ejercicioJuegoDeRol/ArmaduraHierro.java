package ar.edu.info.unlp.ejercicioJuegoDeRol;

public class ArmaduraHierro implements Armadura{

	@Override
	public int pelearContra(Arma arma) {
		return arma.pelearContraArmaduraHierro();
	}
	
}
