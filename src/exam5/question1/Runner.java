package exam5.question1;

public class Runner {

	// Design Pattern: Adapter
	public static void main(String[] args) {

		BadHelicopter badHelicopter = new BadHelicopter();
		Enemy tank = new EnemyTank();
		
		Enemy badHelicopterAdapter = new BadHelicopterToEnemyAdapter(badHelicopter);
		
		tank.driveBackward();
		tank.driveForward();
		tank.turnLeft();
		tank.turnRight();
		tank.fireWeapon();
		System.out.println("===================");
		
		badHelicopterAdapter.driveBackward();
		badHelicopterAdapter.driveForward();
		badHelicopterAdapter.turnLeft();
		badHelicopterAdapter.turnRight();
		badHelicopterAdapter.fireWeapon();
	}

}
