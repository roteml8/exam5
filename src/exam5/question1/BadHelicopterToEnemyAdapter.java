package exam5.question1;

public class BadHelicopterToEnemyAdapter implements Enemy {

	private BadHelicopter badHelicopter;

	public BadHelicopterToEnemyAdapter(BadHelicopter badHelicopter) {
		this.badHelicopter = badHelicopter;
	}

	@Override
	public void turnRight() {
		badHelicopter.yawRight();
		
	}

	@Override
	public void turnLeft() {
		badHelicopter.yawLeft();
		
	}

	@Override
	public void driveForward() {
		badHelicopter.flyUp();
		
	}

	@Override
	public void driveBackward() {
		badHelicopter.flyDown();
		
	}

	@Override
	public void fireWeapon() {
		badHelicopter.launchMissile();
		
	}
	
	
	
}
