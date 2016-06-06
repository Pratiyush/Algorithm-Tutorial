package arrays;
//Another method is to count zeros or ones.
public class Segregate0sAnd1s {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array   =  {0, 1, 0, 1, 0, 0, 1, 1, 1, 0,0,0,0,1,1,1,1,0,0,0,0}; 
		segregate0sAnd1s(array);
		printArray(array);
	}
	
	private static void printArray(int[] intArr){
		for(int i:intArr)
		System.out.print(i+",");
		System.out.println();
	}
	
	public  static void segregate0sAnd1s(int[] input){
		int head = 0;
		int tail = input.length -1;
		
		
		while(head<=tail){
			if(input[head] == 0 && input[tail] == 1){
				head++;
				tail--;
			}else if(input[head] == 0 && input[tail] == 0){
				head++;
			}else if(input[head] == 1 && input[tail] == 1){
				tail--;
			}else if(input[head] == 1 && input[tail] == 0){
				
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
