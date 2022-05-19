package exam5.question1;

public class Runner {

	// Design Pattern: Adapter
	public static void main(String[] args) {

		BadHelicopter badHelicopter = new BadHelicopter();
		EnemyTank tank = new EnemyTank();
		
		HelicopterToEnemyAdapter helicopterAdapter = new HelicopterToEnemyAdapter(badHelicopter);
		
		tank.driveBackward();
		tank.driveForward();
		tank.turnLeft();
		tank.turnRight();
		tank.fireWeapon();
		System.out.println("===================");
		
		helicopterAdapter.driveBackward();
		helicopterAdapter.driveForward();
		helicopterAdapter.turnLeft();
		helicopterAdapter.turnRight();
		helicopterAdapter.fireWeapon();
	}

}
