import java.util.Scanner;

/**
 * In this assignment, you will implement a simple game.  This game has 2 options for the user playing.  Based on user input, the 
 * user can choose to either convert time, from seconds to hours, minutes, and seconds, or calculate the sum of all digits in an integer.  
 * 
 * At the beginning of the game, the user will be prompted to input either 1 or 2, to indicate which option of the game they want 
 * to play.  1 will indicate converting time, and 2 will indicate calculating the sum of digits in an integer.
 * 
 * For converting time, the user will be prompted to input a number of seconds (as an int) and the program will call a method that 
 * will convert the seconds to time, in the format hours:minutes:seconds, and print the result.  For example, if the user enters 6734, 
 * the program will print the time, 1:52:14. As another example, if the user enters 10,000, the program should print 2:46:39.
 * 
 * For calculating the sum of digits in an integer, the user will be prompted to input a number (as a non-negative int) and the program will 
 * call a method to calculate the sum of the digits in that number, and print the result.  For example, if the user enters 321, 
 * the program will print the sum, 6, because the individual digits in the number add up to 6.  3 + 2 + 1 = 6.
 * 
 * Each method has been defined for you, but without the code. See the javadoc for each method for instructions on what the method 
 * is supposed to do and how to write the code. It should be clear enough.  In some cases, we have provided hints to help you get started.
 * 
*/
public class SimpleGame {

	/**
	 * Write a method to convert the given seconds to hours:minutes:seconds.
	 * @param seconds to convert
	 * @return string for the converted seconds in the format: 23:59:59
	 * 
	 * Example(s): 
	 * - If input seconds is 1432, print and return output in the format: 0:23:52
	 * - If input seconds is 0, print and return output in the format: 0:0:0
	 * - If input seconds is not valid (negative), print and return: -1:-1:-1.  
	 *   So if input seconds is -2, print and return: -1:-1:-1 
	 *   If input seconds is -3214, likewise print and return: -1:-1:-1
	 */
	public String convertTime(int seconds){
		// TODO: Your code goes here
		if(seconds<0){
			return "-1:-1:-1";
		}
		int houres=seconds/36000;
		int remainingseconds = seconds % 3600;
		int minutes = remainingseconds/60;
		int secs = remainingseconds % 60;

		return String.format("%d:%d:%d",houres,minutes,secs);
	}
	/**
	 * Write a method that adds all the digits in the given non-negative integer.
	 * @param integer to add digits
	 * @return integer in which all the digits in the given non-negative integer are added.
	 * 
	 * Example(s): 
	 * - If input is 565, print and return 16.
	 * - If input is 7, print and return 7.
	 * - If input is 0, print and return 0.
	 */
	public int digitsSum(int input){
		// TODO: Your code goes here
		int sum = 0;
		while(input>0)
		{
			sum +=input %10;
			input/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// Create an instance of the SimpleGame class.
		// TODO: Your code goes here
		SimpleGame game = new SimpleGame();
		Scanner sc = new Scanner(System.in);
		// Ask the user which game to play.
		// Then ask the user for input and pass the value to the corresponding method.
		System.out.println("Welcome to the Simple Game!");
	    System.out.println("Choose an option:");
	    System.out.println("1. Convert seconds to hours:minutes:seconds");
	    System.out.println("2. Calculate the sum of digits in an integer");

	    int choice = sc.nextInt();
		// If the user enters 1, ask for an integer to convert and call the convertTime method.
		// If the user enters 2, ask for an integer and call the digitsSum method.
		if (choice == 1) {
	        System.out.print("Enter the number of seconds: ");
	        int seconds = sc.nextInt();
	        String result = game.convertTime(seconds);
	        System.out.println("Converted time: " + result);
	    } else if (choice == 2) {
	        System.out.print("Enter a non-negative integer: ");
	        int number = sc.nextInt();
	        int result = game.digitsSum(number);
	        System.out.println("Sum of digits: " + result);
	    } else {
	        System.out.println("Invalid choice. Please enter 1 or 2.");
	    }
		// TODO: Your code goes here
		sc.close();
	}	
}