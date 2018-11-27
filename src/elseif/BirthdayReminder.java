
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
		String kevinsBirthday = "November 4th";
		String trasBirthday = "Jan 17th";
		// 2. Find out which birthday the user wants and and store their response in a variable
	String bbb = JOptionPane.showInputDialog("Whose birthday would you like to know?\n Mom\nDad\nReyna\nKevin\nTra");
		// 3. Print out what the user typed
		System.out.println(bbb);
		// 4. if user asked for "mom"
		if (bbb.equalsIgnoreCase("mom")) {
			//print mom's birthday
		System.out.println(momsBirthday);
	}
		// 5. if user asked for "dad"
			else if(bbb.equalsIgnoreCase("dad")) {
			// print dad's birthday
				System.out.println(dadsBirthday);
			}
		// 6. if user asked for your name
			else if(bbb.equalsIgnoreCase("reyna")) {
				// print myBirthday	
				System.out.println(myBirthday);
			}
			else if(bbb.equalsIgnoreCase("kevin")) {
				System.out.println(kevinsBirthday);
			}
			else if(bbb.equalsIgnoreCase("Tra")) {
				System.out.println(trasBirthday);
			}sssss
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			else {
				System.out.println("Sorry, i don't remember that person's birthday!");
			}
	} 
}
