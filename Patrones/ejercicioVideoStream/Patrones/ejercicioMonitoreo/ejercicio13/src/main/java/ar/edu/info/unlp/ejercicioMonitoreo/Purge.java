package ar.edu.info.unlp.ejercicioMonitoreo;

public class Purge extends ProcessStep{

	@Override
	protected boolean basicExecute(MixingTank tank) {
		return tank.heatPower(0) && tank.mixerPower(0) && tank.purge();
	}
	
}
