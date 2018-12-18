//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		Random random = new Random();
		int numran = random.nextInt(100) + 1;
		// 2. Print out the random variable above
		System.out.println(numran);
		// 11. Repeat steps 1 to 10 ten times
for (int i = 0; i < 20; i++) {
	

		// 1. Ask the user for a guess using a pop-up window, and save their response
		String guess = JOptionPane.showInputDialog("Guess a number.");
		// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int numguess = Integer.parseInt(guess);
		// 5. if the guess is correct
		if (guess.equals(numran)) {
			// 6. Win
			JOptionPane.showMessageDialog(null, "You won!!!!");
		}
		// 12. Use "System.exit(0);" to quit the game if the user guessed the right
		// answer.
		

		// 7. if the guess is high
		else if (numguess > numran) {
			JOptionPane.showMessageDialog(null,"Too high");
		
		// 8. Tell them it's too high
		}
		// 9. if the guess is low
		else if (numguess < numran) {
			JOptionPane.showMessageDialog(null, "Too low");
		}
		// 10. Tell them it's too low
		}
		// 13. Tell them they lose

	}

}
