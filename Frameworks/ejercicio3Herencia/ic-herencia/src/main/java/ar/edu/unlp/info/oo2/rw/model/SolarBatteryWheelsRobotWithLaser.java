package ar.edu.unlp.info.oo2.rw.model;

public class SolarBatteryWheelsRobotWithLaser extends SolarBatteryWheelsRobot{

	public SolarBatteryWheelsRobotWithLaser(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fireArms() {
		System.out.println("Robot " + this.getName() + " firing lasers");
	}

}
