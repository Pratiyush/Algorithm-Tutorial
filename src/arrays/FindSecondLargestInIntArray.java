package arrays;

public class FindSecondLargestInIntArray {
	public static void main(String[] args) {

		// intialize the array values
		int arr[] = { 1, 23, 47, 81, 92, 52, 48, 56, 66, 65 };
		int largest = arr[0];
		int secondLargest = arr[0];
		// check the condition
		for (int i = 0; i < arr.length; i++) {
			// this condition check for largest number
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		// print the result
		System.out.println("second largest number is:" + secondLargest);
	}
}
