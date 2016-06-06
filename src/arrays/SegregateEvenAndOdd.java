package arrays;


public class SegregateEvenAndOdd {

	public static void main(String[] args) {
		int[] input  = {12, 34, 45, 9, 8, 90, 3,2,1,1,2,3,3,4,5,6,7,9};
		segregateEvenAndOdd(input);
		printArray(input);

	}
	
	private static void printArray(int[] intArr){
		for(int i:intArr)
		System.out.print(i+",");
		System.out.println();
	}
	
	public  static void segregateEvenAndOdd(int[] input){
		int head = 0;
		int tail = input.length -1;
		
		
		while(head<=tail){
			if(input[head]%2 == 0 && input[tail]%2 == 0){
				head++;
			}else if(input[head]%2 == 0 && input[tail]%2 != 0){
				head++;
				tail--;
			}else if(input[head]%2 != 0 && input[tail]%2 != 0){
				tail--;
			}else if(input[head]%2 != 0 && input[tail]%2 == 0){
				
				int headContent = input[head];
				input[head] = input[tail];
				input[tail] = headContent;
				head++;
				tail--;
			}else{
				System.out.println("Something is wrong");
			}
		}
	}
}
