package string;

import java.util.ArrayList;
import java.util.List;

/*Time Complexity: O(n)
Find the count of duplicate character
*/
public class FrequencyOfDuplicates {
	public static void main(String[] args) {
		//String input  = "geeksforgeeks";
		String input  = "test string";
		char charArr[] = input.toCharArray();
		int  intArr[] = new int[256];
		List<String> list = new ArrayList<String>();
		printDuplicate(charArr,intArr,list);
	}
	
	static void printDuplicate(char[] charArr,int  intArr[],List<String> list)
	{
	    for (int i = 0; i<charArr.length; i++){
	    	int mark = charArr[i];
    		intArr[mark] = intArr[mark]+1;
	    }

	    for (int i = 0; i<256; i++){
	    	if(intArr[i]>1){
	    		char c = (char) i;
	    		System.out.println(c+", "+intArr[i]);
	    	}
	    }
	    
	    
	}
	
}
