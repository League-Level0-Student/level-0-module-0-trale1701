import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot t3000 = new Robot();
		t3000.miniaturize();
		t3000.setSpeed(5);
		t3000.penDown();
		t3000.setPenWidth(10);
		for (int i = 0; i <3; i++) {
		t3000.turn(270);
		t3000.move(100);
		}
		t3000.turn(180);
		t3000.move(100);
		for (int i = 0; i <2; i++) {
			t3000.turn(270);
			t3000.move(100);
			}
		t3000.penUp();
		t3000.move(100);
		t3000.turn(270);
		t3000.move(100);
		t3000.expand();
		t3000.sparkle();
		for (int i = 0; i < 1000; i++) {
		t3000.turn(45);
		}
		
		
		
		
	}
}


























