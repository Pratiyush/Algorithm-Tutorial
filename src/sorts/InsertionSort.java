package sorts;

public class InsertionSort {
	 public static void main(String a[]){
	        int[] arr1 = {10,34,2,56,7,67,88,42};
	        int[] arr2 = doInsertionSort(arr1);
	        for(int i:arr2){
	            System.out.print(i);
	            System.out.print(", ");
	        }
	    }
	     
	    public static int[] doInsertionSort(int[] input){
	         
	        int temp;
	        for (int i = 1; i < input.length; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(input[j] < input[j-1]){
	                    temp = input[j];
	                    input[j] = input[j-1];
	                    input[j-1] = temp;
	                    printArr(input,"----");
	                }
	            }
	            printArr(input,"<<");
	        }
	        printArr(input,"===");
	        return input;
	    }

	    private static void printArr(int[] arr,String y){
			for(int number:arr)
				System.out.print(number+",");
			System.out.println(y+"\n");
		}

}
