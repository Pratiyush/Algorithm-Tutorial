package string;

/*Write a C program to print all permutations of a given string
A permutation, also called an “arrangement number” or “order,” is a rearrangement of the elements of an ordered list S into a one-to-one correspondence with S itself. A string of length n has n! permutation.
Source: Mathword(http://mathworld.wolfram.com/Permutation.html)

Below are the permutations of string ABC.
ABC, ACB, BAC, BCA, CAB, CBA

Here is a solution using backtracking.

Algorithm Paradigm: Backtracking
Time Complexity: O(n*n!)
*/
public class PrintAllPermutations {
	// C program to print all permutations with duplicates allowed
	 
	/* Function to swap values at two pointers */
	static void swap(char[] a,int x, int y)
	{
	    char temp;
	    temp = a[x];
	    a[x] = a[y];
	    a[y] = temp;
	}
	 
	/* Function to print permutations of string
	   This function takes three parameters:
	   1. String
	   2. Starting index of the string
	   3. Ending index of the string. */
	static void permute(char[] a, int l, int r)
	{
	   int i;
	   if (l == r)
	     System.out.println(a);
	   else
	   {
	       for (i = l; i <= r; i++)
	       {
	          swap(a,l, i);
	          permute(a, l+1, r);
	          swap(a,l, i); //backtrack
	       }
	   }
	}
	 
	/* Driver program to test above functions */
	public static void main(String[] args)
	{
	    char[] str = {'A','B','C','D'};
	    permute(str, 0, str.length-1);
	}
}
