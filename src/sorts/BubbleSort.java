package sorts;

public class BubbleSort {
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] intArray = {0,5,7,4,3,1,6,2};
		bubbleSort.printArr(intArray);
		bubbleSort.bubbleSort(intArray);
		bubbleSort.printArr(intArray);
	}
	
	public void bubbleSort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=(arr.length-1);j>0;j--){
				if(arr[j-1]>arr[j])swapPositions(j-1,j,arr);
			}
		}
	}
	
	public void swapPositions(int i,int j,int[] arr){
		int x = arr[i];
		arr[i] = arr[j];
		arr[j] = x;
	}
	
	private void printArr(int[] arr){
		for(int number:arr)
			System.out.print(number+",");
		System.out.println("\n");
	}
}
