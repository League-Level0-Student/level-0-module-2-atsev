//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		int x = 0;
		String y = JOptionPane.showInputDialog("Why didn't the skeleton cross the road?");
		if (y.equals("He didn't have the guts to!")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			x++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong....");	
	}
		JOptionPane.showMessageDialog(null, "Your score is " + x);
		}
	}


