/**************************************************************************
 *  Class: Factorial.java   1.00
 *
 * Revision History:
 * Revision No.     Project  	 		Year  		Author   
 *         1.0      JavaJackAss  		2014  		Pratiyush Kumar Singh
 *  
 * Description
 *	- Factorial of a non-negative integer n, denoted by n!, 
 *	  is the product of all positive integers less than or equal to n. 0!= 1
 *
 * Facts
 *  - Probability, Binomial Theorem,Permutations and combinations  of those objects etc.
 *  - This factorial was known at least as early as the 12th century, to Indian scholars.
 *  - The notation n! was introduced by Christian Kramp in 1808.
 *           
 * Remarks
 *	- None 
 *
 *************************************************************************/

package number;

/**
 * @author Pratiyush Kumar Singh
 * @version 1.0
 * @since 23-Feb-2014
 */
public class Factorial {

	public static void main(String[] args) {
		int f1 = factorialRecursive(10);// Factorial Using Recursion
		int f2 = factorialWhile(10);// Factorial Using While Loop
		int f3 = factorialDoWhile(10);// Factorial Using Do While Loop
		int f4 = factorialFor(10);// Factorial Using For Loop

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
	}

	/**
	 * This method returns factorial value using recursive loop
	 * 
	 * @param int
	 * @return int
	 * @author Pratiyush Kumar Singh
	 * @since Version 1.0
	 */
	static int factorialRecursive(int n) {
			if (n == 1 || n == 0) {
				return 1;
			}
			return n * (factorialRecursive(n - 1));
	}

	/**
	 * This method returns factorial value using while loop
	 * 
	 * @param int
	 * @return int
	 * @author Pratiyush Kumar Singh
	 * @since Version 1.0
	 */
	static int factorialWhile(int i) {
		int factorial = 1;
		while (i > 0) {
			if (i == 1) {
				break;
			}
			factorial = factorial * i;
			i--;
		}
		return factorial;
	}
	
	/**
	 * This method returns factorial value using do while loop
	 * 
	 * @param int
	 * @return int
	 * @author Pratiyush Kumar Singh
	 * @since Version 1.0
	 */
	static int factorialDoWhile(int i) {
		int factorial = 1;
		do{
			if (i == 1) {
				break;
			}
			factorial = factorial * i;
			i--;
		}while(i > 0);
		return factorial;
	}
	
	/**
	 * This method returns factorial value using for loop
	 * 
	 * @param int
	 * @return int
	 * @author Pratiyush Kumar Singh
	 * @since Version 1.0
	 */
	static int factorialFor(int i) {
		int factorial = 1;
		// Using for loop
		for (; i > 0; i--) {
			if (i == 1) {
				break;
			}
			factorial = factorial * i;
		}
		return factorial;
	}
}
