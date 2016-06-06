package number;

public class ReverseNumber {

	public static void main(String args[]) {
        int b;// take a variable to perform Reverse operation
        System.out.println("take a number=45");// //take a input value
        System.out.print("Reverse the Number is ");
        for (int a = 45; a > 0; a = a / 10)// condition for Reverse the number
        {
            b = a % 10;
            System.out.print(b);
        }
    }
	
	/* Recursive function to reverse digits of num */
	public static void reversDigits(long number) {
		if (number < 10) {
			System.out.println(number);
			return;
		} else {
			System.out.print(number % 10);
			reversDigits(number / 10);
		}
	}
}
