package _03_if_else._3_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {


		// 1. Set a password in a String variable
		String password = "MiRi's";
		// 2. Using a pop-up, ask the first person for a secret message and store it in a variable
String message = JOptionPane.showInputDialog("what is your secret message");
		
		
		// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
		//    if they can guess the passcode
// one equal sign = means "gets", two equal signs == means is the thing on the left of it the same as on the right

	String userGuess = JOptionPane.showInputDialog(null, "you can only see the secret messege if you gues the password");
//if (password.equalsIgnoreCase(userGuess));
		// 4. If their guess matches the password, show them the secret message
	/*
	 * Notice the pattern below
	 * 
	 * if (test condition) {
	 * 		do this code here
	 * 		the curly braces are important if you have several lines of code inside the 'if' or 'else'
	 * }
	 * else	 {	// test condition is false
	 *      do this other code here
	 *      and this
	 * }
	 * 
	 * questions before we go back to riddler?
	 * 
	 */
if (userGuess.equals( "MiRi's"))	// == only works for int, double, char, boolean ... this are "primitive" data types
							// userGuess is what type? String is a class not a primitive type
	JOptionPane.showMessageDialog(null, message);
	
		// 5. If the password does not match, pop-up "INTRUDER!!"
else 
	JOptionPane.showMessageDialog(null, "INTRUDER!!!");
	}
	// Hi Miranda.  Once I set students up with their VNCs, etc, I will check in with you.  Maybe do a review
	// of some of the ideas you're learning here?  
	//HOW is it going?  want me to help?
}
