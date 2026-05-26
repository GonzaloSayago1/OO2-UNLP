package ar.edu.unlp.info.oo2.rw.model;

public class SolarBatteryWheelsRobotWithBombs extends SolarBatteryWheelsRobot {

	public SolarBatteryWheelsRobotWithBombs(String name) {
		super(name);
	}

	@Override
	public void fireArms() {
		System.out.println("Robot " + this.getName() + " firing bombs");
	}

}
