package ar.edu.unlp.info.oo2.rw.model;

public abstract class SolarBatteryWheelsRobot extends SolarBatteryRobot{

	public SolarBatteryWheelsRobot(String name) {
		super(name);
	}
	
	public void move() {
        System.out.println("Robot " + this.getName() + " moving on wheels");
    }
}
