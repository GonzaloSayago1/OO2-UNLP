package ar.edu.unlp.info.oo2.rw.model;

public class SolarBatteryOvercraftRobotWithBombs extends SolarBatteryOvercraftRobot{

	public SolarBatteryOvercraftRobotWithBombs(String name) {
		super(name);
	}

	@Override
	public void fireArms() {
		System.out.println("Robot " + this.getName() + " firing bombs");
	}

}
