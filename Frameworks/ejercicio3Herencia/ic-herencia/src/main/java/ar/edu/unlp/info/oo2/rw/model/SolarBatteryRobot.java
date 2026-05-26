package ar.edu.unlp.info.oo2.rw.model;

public abstract class SolarBatteryRobot extends Robot{

	public SolarBatteryRobot(String name) {
		super(name);
	}
	
	public void consumeBattery() {
        System.out.println("Robot " + this.getName() + " using solar energy with battery");
    }
}
