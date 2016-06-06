package string;
/*Time Complexity: O(n)

*/
public class PrintAllTheDuplicates {
	public static void main(String[] args) {
		//String input  = "geeksforgeeks";
		String input  = "test string";
		char charArr[] = input.toCharArray();
		int  intArr[] = new int[256];
		printDuplicate(charArr,intArr);
		printString(charArr);
	}
	
	static void printDuplicate(char[] charArr,int  intArr[])
	{
	    for (int i = 0; i<charArr.length; i++){
	    	int mark = charArr[i];
	    	if(intArr[mark]==0){
	    		intArr[mark] = 1;
	    	}else{
	    		if(intArr[mark]==1)
	    			System.out.print(charArr[i]+" ,");
	    		intArr[mark] = intArr[mark]+1; 
	    	}
	    }
	}
	
	private static void printString(char[] charArr){
		for(char c:charArr){
			if(c == ' ')break;//String Ends Here..Rest of Char are ' '
			System.out.print(c);
		}
	}
}
