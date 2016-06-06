package search;

public class LinearSearch {
	
	public static int search(int[] arr,int key){
		
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key) return i; 
		}
		
		return -1;
	}
	
	public static void main(String args[]){
		 int[] arr= {3,4,1,44,5,23,33,1,3,9,34};
	        int key = 34;
	        System.out.println("Element "+key+" found at index: "+search(arr, key));
	        
	        
	        int[] intArr= {-1,0,1,23,44,41,95,234,1,4,9};
	        key = 23;
	        System.out.println("Element "+key+" found at index: "+search(intArr, key));
	}

}
