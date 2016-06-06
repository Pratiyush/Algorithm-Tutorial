package string;

public class ReverseStringByWord {
	
	static StringBuffer data = new StringBuffer("Singh Kumar Pratiyush Name      My");
	public static void main(String[] args){
	 	
		int i = 0,start=0,end = 0;
		while(i<data.length()){
			if(data.charAt(i)==' ' ){
				end = i-1;
				swap(start,end);
				start = i+1;
			}else if(data.length() == i+1){//Added for last word if there is no space.
				swap(start,i);
			}
			i++;
		}
		swap(0,data.length()-1);
		System.out.println(data);
	}
	 
	public static void swap(int start, int end) {
		while(start<end){
			char temp = data.charAt(start);
			data.setCharAt(start, data.charAt(end));
			data.setCharAt(end,temp);
			start++;end--;
		}
	}
}
