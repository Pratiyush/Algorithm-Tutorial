package arrays;
/**************************************************************************
 *  Class: Permutations.java   1.00
 *
 * Revision History:
 * Revision No.     Project  	 		Year  		Author   
 *         1.0      Free-Kode  			2014  		Pratiyush Kumar Singh
 *  
 * Description
 *	- The notion of permutation relates to the act of arranging all the members of a set 
 *    into some sequence or order, or if the set is already ordered, rearranging (reordering) 
 *    its elements, a process called permuting.
 *
 * Facts
 *	- The rule to determine the number of permutations of n objects was known in Indian culture
 *     at least as early as around 1150: the Lilavati by the Indian mathematician Bhaskara II.
 *  - Fabian Stedman in 1677 described factorials when explaining the number of permutations of bells in change ringing. 
 * 
 * Remarks
 *	- No of Permutations is sizeof Int Array ! = sizeof Int Array X (sizeof Int Array -1) X ... X (sizeof Int Array -n) X ... X 1 
 	- Results for size of int array 1 is 1, 2 is 2, 3 is 6, 4 is 24....so on.
 *
 *************************************************************************/
import java.util.Arrays;
/**
 * @author Pratiyush Kumar Singh
 * @version 1.0 
 * @since 11-Apr-2016
 */
public class Permutations {
	
	/*Recursive Approach <-- STARTS HERE */
	/**
	 * This method used to swap the index entity with give indexes.
	 * 
	 * @param arr - input integer array
	 * @param i   - index which need to be swapped wit j index value
	 * @param j   - index which need to be swapped wit i index value
	 * @return    - NO RETURN VALUE
	 * @since Version 1.0
	 */
	public void swap(int[] arr, int i, int j)
	{
	    int tmp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = tmp;
	}
	/**
	* This method call recursively permute method until all permutes are found.
	 * 
	 * @param arr - Array that need to be permute
	 * @param i   -
	 * @return    - NO RETURN VALUE
	 * @since Version 1.0
	 */
	public void permute(int[] arr, int i)
	{
	    if (i == arr.length)
	    {
	        System.out.println(Arrays.toString(arr));
	        return;
	    }
	    for (int j = i; j < arr.length; j++)
	    {
	        swap(arr, i, j);      // enumerates on index  i
	        permute(arr, i + 1);  // recurse call
	        swap(arr, i, j);      // backtracking
	    }
	} 
	/*Recursive Approach STARTS HERE  --> */
	
	/**
	* This methods is starting point of Program.
	 * 
	 * @param  args - NO PARAMETER REQUIRED
	 * @return void - NO RETURN VALUE
	 * @since  Version 1.0
	 */
	public static void main(String[] args) {
		
		Permutations permutations = new Permutations();
		int[] arr = {1, 2, 3,4};
		permutations.permute(arr, 0);
	}
}
