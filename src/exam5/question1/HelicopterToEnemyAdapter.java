package exam5.question1;

public class HelicopterToEnemyAdapter implements Enemy {

	BadHelicopter badHelicopter;

	public HelicopterToEnemyAdapter(BadHelicopter badHelicopter) {
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
