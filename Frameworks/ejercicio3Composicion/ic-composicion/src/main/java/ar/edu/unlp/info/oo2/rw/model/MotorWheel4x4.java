package ar.edu.unlp.info.oo2.rw.model;

public class MotorWheel4x4 extends Locomotion{
	@Override
	public void move(Robot r) {
		System.out.println("Robot " + r.getName() + " moving on motor wheels 4x4");
	}
}
