package _05_for_loops._1_my_ages;

public class MyAges {
	public static void main(String[] args) {
		
		/** This program will use loops to print all the ages you have been alive, 
		 * from zero up to your current age. **/

		/*
		loop is for doing something repetitive.  there are two types of loops - 
		while and for
		
		this program will print your ages from 0 to your current age.
		how old are you?14
		 */
		
		int yourCurrentAge = 14;
				
		int age = 0;
				
		while ( age <= yourCurrentAge ) {
			System.out.println(age);
			age = age + 1; // age++
			
		}
		
		for ( age = 0; age <= yourCurrentAge;age++) {
					// age is loop control variable
			System.out.println(age);
		}

	
	}	// method main
	
}	// class MyAges

