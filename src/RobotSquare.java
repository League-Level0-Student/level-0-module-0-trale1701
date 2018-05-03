/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot t3000 = new Robot();
t3000.miniaturize();

        // 3. Put the robot's pen down
t3000.penDown();
t3000.setPenWidth(10);

        // 6. Make the robot move as fast as possible

t3000.setSpeed(10);
        // 5. Do everything below here 4 times


        //         2. Move your robot 200 pixels
for (int i = 0; i < 4; i++) {
	

t3000.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
t3000.turn(90);
t3000.setRandomPenColor();

}


    }
}
