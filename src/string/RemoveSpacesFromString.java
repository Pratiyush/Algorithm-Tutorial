package string;
/*Remove spaces from a given string
Given a string, remove all spaces from the string and return it.

Input:  "g  eeks     for ge  eeks  "
Output: "geeksforgeeks"

Expected time complexity is O(n) and only one traversal of string.

We strongly recommend you to minimize your browser and try this yourself first.

Below is a Simple Solution

1) Iterate through all characters of given string, do following
   a) If current character is a space, then move all subsequent
      characters one position back and decrease length of the 
      result string.
Time complexity of above solution is O(n2).

A Better Solution can solve it in O(n) time. The idea is to keep track of count of non-space character seen so far.

1) Initialize 'count' = 0 (Count of non-space character seen so far)
2) Iterate through all characters of given string, do following
     a) If current character is non-space, then put this character
        at index 'count' and increment 'count'
3) Finally, put '\0' at index 'count'*/
public class RemoveSpacesFromString {
	// An efficient C++ program to remove all spaces
	// from a string
	 
	// Function to remove all spaces from a given string
	static void removeSpaces(char[] str)
	{
	    // To keep track of non-space character count
	    int count = 0;
	 
	    // Traverse the given string. If current character
	    // is not space, then place it at index 'count++'
	    for (int i = 0; i<str.length; i++){
	    	   if (str[i] != ' ')
		            str[count++] = str[i]; // here count is
		                                   // incremented
	    }
	    
	    for (int i = count; i <str.length; i++){
	    	str[i] = ' ';
	    }
	    	 
	}
	 
	// Driver program to test above function
	public static void main(String[] args)
	{
	    String str = "g  eeks     for ge  eeks  ";
	    char[] charArr = str.toCharArray();
	    removeSpaces(charArr);
	    printString(charArr);
	}
	
	private static void printString(char[] charArr){
		for(char c:charArr){
			if(c == ' ')break;//String Ends Here..Rest of Char are ' '
			System.out.print(c);
		}
	}
}
/*Output:

geeksforgeeeks
Time complexity of above solution is O(n) and it does only one traversal of string.

Thanks to Souravi Sarkar for suggesting this problem and initial solution. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed abov*/