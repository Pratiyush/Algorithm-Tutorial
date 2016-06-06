package string;
/*Time Complexity: O(n)
 * It maintains the order of String
 * */
public class RemoveAllDuplicatesFromString {

	public static void main(String[] args) {
		String input  = "geeksforgeeks";
		char charArr[] = input.toCharArray();
		int  intArr[] = new int[256];
		removeDuplicate(charArr,intArr);
		printString(charArr);
	}
	
	static void removeDuplicate(char[] charArr,int  intArr[])
	{
	    int count = 0;
	    for (int i = 0; i<charArr.length; i++){
	    	int mark = charArr[i];
	    	if(intArr[mark]==0){
	    		intArr[mark] = -1;
	    		charArr[count++] = charArr[i];
	    	}
	    }
	    
	    for (int i = count; i <charArr.length; i++){
	    	charArr[i] = ' ';
	    }
	}
	
	private static void printString(char[] charArr){
		for(char c:charArr){
			if(c == ' ')break;//String Ends Here..Rest of Char are ' '
			System.out.print(c);
		}
	}
}
