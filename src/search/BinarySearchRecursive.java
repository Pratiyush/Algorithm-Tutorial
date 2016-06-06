package search;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
		int find = 5;
		int index = search(arr,find,0,arr.length);
        System.out.println(find + ((index == -1) ? " is not present in the array or array is not sorted" : (" is at index " + index+ "of int array")));
        System.out.println(find + ((index == -1) ? " is not in the array" : (" is at index " + index)));

	}

	public static int search(int[] arr,int find,int startFrom,int searchTo){
		return -1;
	}
	/*public static void main(String[] args){
        int[] searchMe;
        int someNumber;
        ...
        int index = binarySearch(searchMe, someNumber, 0, searchMe.length);
        System.out.println(someNumber + ((index == -1) ? " is not in the array" : (" is at index " + index)));
        ...
}
 
public static int binarySearch(int[] nums, int check, int lo, int hi){
        if(hi < lo){
                return -1; //impossible index for "not found"
        }
        int guess = (hi + lo) / 2;
        if(nums[guess] > check){
                return binarySearch(nums, check, lo, guess - 1);
        }else if(nums[guess]<check){
                return binarySearch(nums, check, guess + 1, hi);
        }
        return guess;
}*/
}
