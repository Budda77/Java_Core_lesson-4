package ua.lviv.lgs.homework;

public class Application {

	public static void main(String[] args) {
		
		Robot robot = new Robot();

		robot.work();
		
		CoffeRobot coffeRobot = new CoffeRobot();
		
		coffeRobot.work();
		
		RobotDancer robotDancer = new RobotDancer();
		
		robotDancer.work();
		
		RobotCoocker robotCoocker = new RobotCoocker();
		
		robotCoocker.work();
		
		// I - variant
		
		Robot [] array = {robot, coffeRobot, robotDancer, robotCoocker};
		
		for(Robot i: array) {
			
			i.work();
		}
		
		// II - variant
		
		Robot [] array2 = new Robot[4];
		
		array2[0] = new Robot();
		array2[1] = new CoffeRobot();
		array2[2] = new RobotDancer();
		array2[3] = new RobotCoocker();
		
		for(int i = 0; i < array.length; i++) {
			array2[i].work();
		}
		
		System.out.println();
		
		// Home Task 2
		
		Animal a = new Animal("Leopard", 110, 7);
		
		System.out.println("Animal name = " + a.getName() + ", Animal speed = " + a.getSpeed() + ", Animal age = " + a.getAge() + " years ______");
		
		a.setName("Bull");
		a.setSpeed(2);
		a.setAge(14);
		
		System.out.println("Animal name = " + a.getName() + ", Animal speed = " + a.getSpeed() + ", Animal age = " + a.getAge() + " years ______");
		

	}

}
