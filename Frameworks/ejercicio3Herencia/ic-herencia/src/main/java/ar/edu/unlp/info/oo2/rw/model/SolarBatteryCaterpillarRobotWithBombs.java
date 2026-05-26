package ar.edu.unlp.info.oo2.rw.model;

public class SolarBatteryCaterpillarRobotWithBombs extends SolarBatterycaterpillarRobot{

	public SolarBatteryCaterpillarRobotWithBombs(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fireArms() {
		System.out.println("Robot " + this.getName() + " firing bombs");
		
	}

}
