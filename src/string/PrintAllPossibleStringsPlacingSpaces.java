package string;

import java.util.Arrays;

public class PrintAllPossibleStringsPlacingSpaces {

	public static void main(String[] args) {
		for(int i=0;i<11;i++){
			//System.out.println(toBinaryString(i));
			//toBase2(i);
			
		}
		//toBase(2,2);
		toBase5(5);
		
		
	}
	 public static void toBase5(int number){
		//shift number 31 bits left
		 int mask = 1<<31;
		 //loop and print 1 or 0
		 for(int i=31;i>=0;i--){
			 
			 if(((1<<i)&number)!=0)
				 System.out.print(1);
			 else
				 System.out.print(0);
			 
			 //every 4-bits print a space. 
			 if((i%4)==0)
			 	System.out.println(" ");
			 	//Update the mask
		//	 	mask=mask>>1;
		 }
		 //print a new line
		 System.out.println();
	 }
	
	 public static void toBase2(int n){
		 StringBuffer binary = new StringBuffer();
		 while (n>0) {
			if((n&1)==1){
				binary.append(1);
			}else{
				binary.append(0);
			}
			n>>=1;
		 }
			System.out.println(binary.reverse());
	 }

		 
	 public static void toBase(int number,int base){
		 String binary = "";
		 int temp =  number/2+1;
		 for(int x=0;x<temp;x++){
			 try{
				 binary+=""+number%base;
			 }catch(Exception e){
				 
			 }
		 }
		 
		 for(int y=binary.length()-1;y>=0;y--){
			 System.out.print(binary.charAt(y));
		 }
		 
	 }
	  public static String toBinaryString(int i) {
	        return toUnsignedString(i, 1);
	    }
	/**
     * Convert the integer to an unsigned number.
     */
    private static String toUnsignedString(int i, int shift) {
        char[] buf = new char[32];
        int charPos = 32;
        int radix = 1 << shift;
        int mask = radix - 1;
        do {
            buf[--charPos] = digits[i & mask];
            i >>>= shift;
        } while (i != 0);

        return new String(buf, charPos, (32 - charPos));
    }
    /**
     * All possible chars for representing a number as a String
     */
    final static char[] digits = {
        '0' , '1' 
    };
    
}
