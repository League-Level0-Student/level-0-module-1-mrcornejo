package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String mariene = "She likes to watch Netflex";
String miranda = "She likes to eat ice cream";
String jessica = "She likes to play with slime";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("What is your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
//String  = "What is remarkable about that person?";
/* if the name is mariene, print popup about mariene
 * else if the name is miranda ...
 * else if the name is jessica
 */
// where did the code store the name that the user entered?
// ANSWER: string mariene.  No, look on line 15 ... its the variable 'name'
// so let me show you how to use it in the 'if' test
// or if you want to handle both upper and lower case

// ok that's a good start.  lets work with it.  look at line 28 - I know it has a red
// x but its good code.  lets use it in line 31
// good ... now are all parentheses paired?....
// good, now lets work on the popup

//JOptionPane.showMessageDialog(null), mariene);	// for example
//JOptionPane.showMessageDialog"null", "pop-up");

		if (name.equalsIgnoreCase("mariene"))
			JOptionPane.showMessageDialog(null, mariene);
		else if (name.equalsIgnoreCase("miranda"))
			JOptionPane.showMessageDialog(null, miranda);
		else if (name.equalsIgnoreCase("jessica"))
			JOptionPane.showMessageDialog(null, jessica);
					}
}

/* ask for the person's name
 * then test which name it is and decide what to say about the person
 *mariene
*miranda
jessica
*/