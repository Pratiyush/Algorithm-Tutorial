	package arrays;

public class FindMissingNumbersFrom1_99 {

	public static void main(String[] args) {
		int[] arr = {678,1,58,979,101,67,4,80,345,7,40,3};
		findMissingNumbers(arr,99);
	
	}
	
	private static void findMissingNumbers(int[] arr, int size){
		boolean[] booleanArray = new boolean[size];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<=size){
				booleanArray[arr[i]] = true;
			}
		}
	}
	
	private static void printMissingNumbers(boolean[] arr){
		
		for(int i=0;i<arr.length;i++){
		}
	}

}
