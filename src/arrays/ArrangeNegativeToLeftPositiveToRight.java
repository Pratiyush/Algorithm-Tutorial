package arrays;

public class ArrangeNegativeToLeftPositiveToRight {

	public static void main(String[] args) {
			int[] arr = {1,0,-2,4,3,4,-1,-2,-4,1,-5,4,3,-7,-7,5-10};  
			arrangeNumbers(arr);
			printArray(arr);
	}
	
	
	private static void arrangeNumbers(int[] arr){
		int head  = 0;
		int tail = arr.length -1;
		
		while(head<tail){
			
			if(arr[head]>0&&arr[tail]>0){
				tail--;
			}else if(arr[head]<0&&arr[tail]<0){
				head++;
			}else if(arr[head]>0&&arr[tail]<0){
				int x = arr[tail];
				arr[tail] = arr[head];
				arr[head] =x;
				head++;
				tail--;
			}else if(arr[head]<0&&arr[tail]>0){
			//correct position
				head++;
				tail--;
			}//All 4 scnarios are covered there is no else
			
		}
		
		printArray(arr);
	}
	
	private static void printArray(int[] intArr){
		for(int i:intArr)
		System.out.print(i+",");
		System.out.println();
	}

}
