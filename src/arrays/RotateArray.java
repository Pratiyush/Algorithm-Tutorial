package arrays;

public class RotateArray {
	int intArrLength;
	public static void main(String[] args) {
		
		int[] intArr = {0,1,2,3,4,5,6,7};
		//int[] intArr = {7,6,5,4,3,2,1,0};
		int rotationCount = 2;//5,6,7,0,1,2,3,4,
		RotateArray rotateArray = new RotateArray();
		rotateArray.intArrLength = intArr.length;
		rotateArray.printArray(intArr);
		//rotateArray.rotateArrayUsingAnotherArray2(intArr,rotationCount);
		//rotateArray.rotateArrayUsingBubbleRotate(intArr,rotationCount);
		rotateArray.rotateArrayUsingReversal(intArr,rotationCount);
	}
	
	
	//Rotate Array using Temp array
	private void rotateArrayUsingAnotherArray1(int[] intArr,int rotationCount){
		//Check Valid Array and Rotation Count
		if(intArr == null || rotationCount == 0){
			System.out.println("Invalid Array or Invalid Rotation Count");
			return;
		}
		//Check if rotation is required
		if(rotationCount%intArrLength == 0){
			System.out.println("Rotation is not required after rotation it will produce same array");
			return;
		}
		
		int[] rotatedArray = new int[intArr.length];
	
		for(int i=0;i<rotationCount;i++){
			rotatedArray[i] = intArr[intArrLength-rotationCount+i];
		}
		
		
		for(int i=rotationCount;i<intArrLength;i++){
			rotatedArray[i] = intArr[i-rotationCount];
		}
		printArray(rotatedArray);
	}
	
	//Rotate Array using Temp array
	private void rotateArrayUsingAnotherArray2(int[] intArr,int rotationCount){
		//Check Valid Array and Rotation Count
		if(intArr == null || rotationCount == 0){
			System.out.println("Invalid Array or Invalid Rotation Count");
			return;
		}
		//Check if rotation is required
		if(rotationCount%intArrLength == 0){
			System.out.println("Rotation is not required after rotation it will produce same array");
			return;
		}
		
		int[] rotatedArray = new int[intArr.length];
	
		for(int i=0;i<intArrLength;i++){

			if(i+rotationCount<intArrLength){
				rotatedArray[i+rotationCount] = intArr[i];
			}else{
				rotatedArray[i+rotationCount-intArrLength] = intArr[i];
			}
			
		}
		
		printArray(rotatedArray);
	}	


	
	
	//Rotate Array using Temp array
	private void rotateArrayUsingAnotherArray3(int[] intArr,int rotationCount){
		//Check Valid Array and Rotation Count
		if(intArr == null || rotationCount == 0){
			System.out.println("Invalid Array or Invalid Rotation Count");
			return;
		}
		//Check if rotation is required
		if(rotationCount%intArrLength == 0){
			System.out.println("Rotation is not required after rotation it will produce same array");
			return;
		}
		
		int[] rotatedArray = new int[intArr.length];
	
		for(int i=0;i<rotationCount;i++){
			rotatedArray[i] = intArr[intArrLength-rotationCount+i];
		}
		
		
		for(int i=rotationCount;i<intArrLength;i++){
			rotatedArray[i] = intArr[i-rotationCount];
		}
		printArray(rotatedArray);
	}

	//Rotate Array using Temp array
	private void rotateArrayUsingAnotherArray4(int[] intArr,int rotationCount){
		//Check Valid Array and Rotation Count
		if(intArr == null || rotationCount == 0){
			System.out.println("Invalid Array or Invalid Rotation Count");
			return;
		}
		//Check if rotation is required
		if(rotationCount%intArrLength == 0){
			System.out.println("Rotation is not required after rotation it will produce same array");
			return;
		}
		
		int[] rotatedArray = new int[intArr.length];
	
		for(int i=0;i<rotationCount;i++){
			rotatedArray[i] = intArr[intArrLength-rotationCount+i];
		}
		
		
		for(int i=rotationCount;i<intArrLength;i++){
			rotatedArray[i] = intArr[i-rotationCount];
		}
		printArray(rotatedArray);
	}
	
	public void rotateArrayUsingBubbleRotate(int[] intArr,int rotationCount){
		for(int i=0;i<rotationCount;i++){
			for(int j=intArrLength-1;j>0;j-- ){
				//if(intArr[j-1]>intArr[j]){
					int temp = intArr[j];
					intArr[j] = intArr[j-1];
					intArr[j-1] = temp;	
				//}
			}
		}
		
		printArray(intArr);
	}
	
	public void rotateArrayUsingReversal(int[] intArr,int rotationCount){
		
		if(intArr == null || rotationCount <= 0){
			throw new IllegalArgumentException("Illegal Arguement");
		}
		
		reverse(intArr,0,intArrLength -rotationCount -1);
		reverse(intArr,intArrLength -rotationCount,intArrLength -1);
		reverse(intArr,0,intArrLength -1);
		printArray(intArr);
	}
	
	private void reverse(int[] intArr,int start,int end){
		
		if(intArr == null|| intArr.length == 1) return;
		while(start<end){
			int temp = intArr[start];
			intArr[start] = intArr[end];
			intArr[end] = temp;
			start++;
			end--;
		}
		
	}

	private void printArray(int[] intArr){
		for(int i:intArr)
		System.out.print(i+",");
		System.out.println();
	}
}

