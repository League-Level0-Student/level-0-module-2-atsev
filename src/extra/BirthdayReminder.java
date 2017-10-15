//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {
	public static void main(String[] args) {
		
		// 1. OPTION: correct the birthdays for your family below
		String momsBirthday = "May 18th";
		String dadsBirthday = "August 26th";
		String myBirthday = "March 9th";

		// 2. Find out whose birthday the user wants and and store their response in a variable
	String x = JOptionPane.showInputDialog("Do you want to know my mom's birthday, my dad's birthday, or my birthday? (Respond: mom, or dad, or you)");
		// 3. Print out what the user typed
		System.out.println(x);
		if (x.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		if(x.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		if(x.equals("you")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
		}
}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for you
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	


