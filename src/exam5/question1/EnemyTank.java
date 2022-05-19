package exam5.question1;

public class EnemyTank implements Enemy {

	@Override
	public void turnRight() {
		System.out.println("Tank is turning right!");
		
	}

	@Override
	public void turnLeft() {
		System.out.println("Tank is turning left!");
		
	}

	@Override
	public void driveForward() {
		System.out.println("Tank is driving forward!");
		
	}

	@Override
	public void driveBackward() {
		System.out.println("Tank is driving backward!");
		
	}

	@Override
	public void fireWeapon() {
		System.out.println("Tank is firing a weapon!");
		
	}

}
