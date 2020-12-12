package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import java.util.jar.Attributes.Name;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String userGuess = JOptionPane.showInputDialog(null,"What can travel around the world while staying in a corner? ");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		// stuck?  what's the name of the variable that stored the user's response to the riddle? not sure?yea
		// ok - in line 14, the code first does what is to the right of the equal sign - showInputDialog
		// then the user types in their answer and hits 'enter'.  then "String userGuess GETS" what the user
		// typed in (I read the equal sign as GETS a value).  So the user's response got stored in
		// 'userGuess'.  Make sense? do you know how to test that variable to see if it has the
		// correct answer?  not sure? yes  ok
		//if (the word 'if' is always followed by parentheses - inside them is a test condition - in this case
			//	testing if 'userGuess' has the correct answer ..a. "a stamp"
		//good start - now let's fix some problems ... where are your () around the test condition?what is that
		//make sense now?
			//	let's fix 2 more problems ... one moment Mariene is here
				//ok i'm back
				//so the next problem - there are no quotes around a variable Name.class..
				//the last problem is a bit harder to explain - when you test a string, you need to
				//call the equals method that tests the characters, so in "a stamp", it tests is the first
				//letter 'a' then the next letter a space ' ', next letter 's' and so on.  it looks like this
				//NOW IT IS CORRECT!
				//now add { } and the code inside the { }
				//let's look at previous examples - can I show you?yes
		if (userGuess.equals("a stamp")) {	// NO SEMICOLON after 'if' or after 'else'
		score++;		
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "wrong");
		}
		
		// 6. Add some more riddles
		// on the left of the equal sign ... here are your options:
		// either make a new variable like String userGuess2
		// or reuse the old variable userGuess.  if you reuse, then
		// DON"T have the word String since you already told the computer
		// it is a String!  ok go ahead...
		String userGuess2  = JOptionPane.showInputDialog(null,"What has many keys but can't open a single lock? ");
			if (userGuess.equals("a piano")) {
				score++;
			}
		// 2. Make a pop up to show the score.
				// it's 11:30.  can you save your work?yes can you scroll up for me  OK
	// **** code on line 59 must be *inside* the 'main' method, not after it
	//you could move line 57 } to below line 60
	JOptionPane.showMessageDialog(null,score);
	}  // this is the end of public static void main(String[] args) {
	}  // this is the end of the class public class TheRiddler, OK?

// can i help you fix the red x?  the code is not in a good spot...let me explain
//
