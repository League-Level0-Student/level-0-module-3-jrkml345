import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot mush = new Robot();

	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog("what what you like the robot to draw \nsquare\ncircle\nTriangle");
	
	if (ans.equalsIgnoreCase("square")) {
		drawSquare();
	}
	else if (ans.equalsIgnoreCase("triangle")) {
		drawTriangle();
	}
	else if(ans.equalsIgnoreCase("circle")) {
		drawCircle();
	}
	}
	static void drawSquare() {
		mush.penDown();
		mush.setSpeed(30);
		for (int i = 0; i < 4; i++) {
			mush.move(100);
			mush.turn(90);
		}
	}

	static void drawTriangle() {
		mush.penDown();
		mush.setSpeed(30);
		for (int i = 0; i < 3; i++) {
			mush.turn(120);
			mush.move(100);
		}
	}

	static void drawCircle() {
		mush.penDown();
		mush.setSpeed(100);
		for (int i = 0; i < 90; i++) {
			mush.turn(4);
			mush.move(4);
		}
	}

}
