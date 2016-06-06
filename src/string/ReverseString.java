package string;

public class ReverseString {

	public static void main(String[] args){
		// Reverse String Using While Loop :including the null character
		char[] test = { 'P', 'A', '3', '3', '1', '5', '\0' };
		reverseWithWhile(test);
		reverseWithFor("Pratiyush");
		System.out.println(reverseRecursion(" doog si eh source projects"));
		
	}
	//Recursion
	public static String reverseRecursion(String input) {
	
		if(input.length()<=1){
			return input;
		}
		
		return reverseRecursion(input.substring(1))+input.charAt(0);
	}
	
	// Using While loop
	// Write code to reverse a C-Style String (C-String means that
	// “abcd” is represented as five characters, including the null character )
	static String reverseWithWhile(char[] target) {

		int head = 0;
		// We are subtracting -2 because we are always keeping null character in
		// end of string.
		int tail = target.length - 2;
		// This loop will run to the middle of string ex. ABC B will be
		// unchanged & ABCD there is no specific middle char.
		while (head < tail) {
			char temp = target[head];
			target[head] = target[tail];
			target[tail] = temp;
			head++;
			tail--;
		}
		
		return new String(target);

	}

	// Using For Loop
	public static String reverseWithFor(String input) {
		char[] chars = input.toCharArray();
		for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		return new String(chars);
	}
}
