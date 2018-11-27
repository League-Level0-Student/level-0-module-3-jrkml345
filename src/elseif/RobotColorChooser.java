//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot spencer = new Robot() ;
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
if (color.equalsIgnoreCase("pink")) {
	spencer.setPenColor(Color.pink);
}
else if(color.equalsIgnoreCase("blue")) {
	spencer.setPenColor(Color.blue);
}
else if(color.equalsIgnoreCase("orange")) {
	spencer.setPenColor(Color.orange);
}
else if(color.equalsIgnoreCase("magenta")) {
	spencer.setPenColor(Color.magenta);
}
else if(color.equalsIgnoreCase("cyan")) {
	spencer.setPenColor(Color.cyan);
}
else if(color.equalsIgnoreCase("gray")) {
	spencer.setPenColor(Color.gray);
}
else if(color.equalsIgnoreCase("red")) {
	spencer.setPenColor(Color.red);
}
else if(color.equalsIgnoreCase("black")) {
	spencer.setPenColor(Color.black);
}
else if(color.equalsIgnoreCase("green")) {
	spencer.setPenColor(Color.green);
}
else if(color)



        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
