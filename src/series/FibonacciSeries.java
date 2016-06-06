/**************************************************************************
 *  Class: FibonacciSeries.java   1.00
 *
 * Revision History:
 * Revision No.     Project  	 		Year  		Author   
 *         1.0      JavaJackAss  		2014  		Pratiyush Kumar Singh
 *  
 * Description
 *	- Fibonacci Series are 1,1,2,3,5,8,13,21,34,55,89,144...
 *	  F(n) = F(n-1)+F(n-2) Where F(0)=0; F(1)=1; F(2)=1
 *	  The first two numbers in the Fibonacci sequence are 1 and 1, or 0 and 1,
 *	  depending on the chosen starting point of the sequence, and each subsequent
 *    number is the sum of the previous two. 
 *    
 *
 * Facts
 *	- Fibonacci Series named after Italian mathematician Leonardo Fibonacci (Born:1170–1250).
 *	- The Human ear reflects the shape of the Fibonacci Spiral.
 *  - Fibonacci is used  in the computational run-time analysis of Euclid's algorithm to 
 *    determine the greatest common divisor of two integers
 *  - Fingers: 8 fingers in total, 5 digits on each hand, 3 bones in each finger,
 *    2 bones in 1 thumb, and 1 thumb on each hand.
 *  - Fibonacci sequence can be found and some of these areas include, flower petals, plants,
 *    fruit, the human face, the human hand and animals (i.e. rabbits).
 *          
 * Remarks
 *	- The 93rd Fibonacci number would overflow a long, but this
 *    will take so long to compute with this function that we
 *    don't bother to check for overflow.
 *
 *************************************************************************/
package series;

import util.StandardOutput;



/**
 * @author Pratiyush Kumar Singh
 * @version 1.0 
 * @since 23-Feb-2014
 */
public class FibonacciSeries {

	public static void main(String[] args) {

		for (int i = 1; i <= 15; i++)
			StandardOutput.print(fibonacciRecursive(i) +" ");// fibonacci using Recursion
		
		StandardOutput.println();
		
		fibonacciSeriesA();// fibonacci using for loop.
		fibonacciSeriesB();// fibonacci using for loop. It simplifies 'fibonacciSeriesA()' method.
		fibonacciWhile();// fibonacci using While loop.
		fibonacciDoWhile();// fibonacci using Do While.
		fibonacciArray();// fibonacci using Array.

	}

	/**
	* This method prints fibonacci number using for loop.
	 * 
	 * @param void
	 * @return void
	 * @author Pratiyush Kumar Singh
	 * @since Version 1.0
	 */
	public static void fibonacciSeriesA() {
		int prev, next, sum, n;
		prev = next = 1;
		for (n = 1; n <= 15; n++) {
			System.out.print(prev+" ");
			sum = prev + next;
			prev = next;
			next = sum;
		}
		StandardOutput.println();
	}
	
	/**
	 * This method prints fibonacci number using for loop.
	 * And it is simplifies method <code>fibonacciSeriesA</code>
	 * 
	 * @param void
	 * @return void
	 * @author Pratiyush Kumar Singh
	 * @since Version 1.0
	 */
	public static void fibonacciSeriesB() {
		int g = 0;// 1st Fibonacci
		int f = 1;// 2nd Fibonacci
		int n = 15;// Upto where

		for (int i = 1; i <= n; i++) {
			StandardOutput.print(f + " ");
			f = f + g;
			g = f - g;
		}
		StandardOutput.println();
	}

	/**
	 * This method prints fibonacci numbers using Array
	 * 
	 * @param void
	 * @return void
	 * @author Pratiyush Kumar Singh
	 * @since Version 1.0
	 */
	public static void fibonacciArray() {
		int febCount = 15;
		int[] feb = new int[febCount];
		feb[0] = 1;
		feb[1] = 1;
		for (int i = 2; i < febCount; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
		}

		for (int i = 0; i < febCount; i++) {
			System.out.print(feb[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * This method returns fibonacci numbers using while loop
	 * 
	 * @param void
	 * @return void
	 * @author Pratiyush Kumar Singh
	 * @since Version 1.0
	 */
	public static void fibonacciWhile(){
		int prev, next, sum, n = 1, count;
			count = 15;
	        prev = next = 1;
	        while (n <= count) {
	        	StandardOutput.print(prev+" ");
	            sum = prev + next;
	            prev = next;
	            next = sum;
	            n++;
	        }
	        StandardOutput.println();
	}
	
	/**
	 * This method returns fibonacci numbers using do while loop
	 * 
	 * @param void
	 * @return void
	 * @author Pratiyush Kumar Singh
	 * @since Version 1.0
	 */
	public static void fibonacciDoWhile(){
		int fib1 = 0;
		int fib2 = 1;
		int temp = 0;
		int fibCount = 1;
		System.out.print(fib2+" ");
		do
		{
			temp = fib1 + fib2;
			StandardOutput.print(temp+" ");
			fib1 = fib2; //Replace 2nd with first number
			fib2 = temp; //Replace temp number with 2nd number
			fibCount++;
			
		} while (fibCount < 15);
		StandardOutput.println();
	}

	/**
	 * This method returns fibonacci number using recursive loop
	 * 
	 * @param int
	 * @return long
	 * @author Pratiyush Kumar Singh
	 * @since Version 1.0
	 */
	public static long fibonacciRecursive(int n) {
		if (n <= 1)
			return n;
		else
			return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
}
