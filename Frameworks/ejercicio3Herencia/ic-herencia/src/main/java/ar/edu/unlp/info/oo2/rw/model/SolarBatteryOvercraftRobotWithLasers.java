package ar.edu.unlp.info.oo2.rw.model;

public class SolarBatteryOvercraftRobotWithLasers extends SolarBatteryOvercraftRobot {

	public SolarBatteryOvercraftRobotWithLasers(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	 public void fireArms() {
        System.out.println("Robot " + this.getName() + " firing lasers");
    }

}
