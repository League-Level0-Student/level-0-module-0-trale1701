import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
	public static void main(String[] args) {
        String color =JOptionPane.showInputDialog("What is your favorite color?");
		JOptionPane.showMessageDialog(null, color +" is my favorite color too!");
		Robot t = new Robot();
		t.miniaturize();
		t.penDown();
		t.setSpeed(50);
		t.setPenWidth(5);
		for (int i = 0; i <3; i++) {
		t.turn(120);
		t.move(100);
		}
		
		
	}

}
