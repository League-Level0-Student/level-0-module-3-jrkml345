
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 1st";
		String dadsBirthday = "Jan 1st";
		String myBirthday = "August 6th";
		// 2. Find out which birthday the user wants and and store their response in a variable
	String bbb = JOptionPane.showInputDialog("Whose birthday would you like to know?");
		// 3. Print out what the user typed
		System.out.println(bbb);
		// 4. if user asked for "mom"
		if (bbb.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
