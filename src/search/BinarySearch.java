package search;
/*Binary search requires a sorted collection. Also, binary searching can only be applied to a collection that allows random access (indexing).
Worst case performance: O(log n)
Best case performance: O(1)*/
//It is also known as half-interval search algorithm finds the position of a target value within a sorted array
/*Class	Search algorithm
Data structure	Array
Worst case performance	O(log n)
Best case performance	O(1)
Average case performance	O(log n)
Worst case space complexity*/

public class BinarySearch {
	public static void main(String[] args){
		
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
		int find = 5;
		int index = search(arr,find);
        System.out.println(find + ((index == -1) ? " is not present in the array or array is not sorted" : (" is at index " + index+ "of int array")));

	}
	
	public static int search(int[] arr,int find){
		
		int right = arr.length -1;
		int left = 0;
		
		while(left<=right){
		
			int guess = (right+left)/2;//Middle Value
			System.out.println("+>>>"+guess);
			if(arr[guess]>find){
				right=guess-1;
			}else if(arr[guess]<find){
				left=guess+1;
			}else{
				return guess;
			}
		}
		
		return -1;
	}


}
