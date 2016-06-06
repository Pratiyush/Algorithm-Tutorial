package string;

public class FindMissingAlphabets {
	public static void main(String[] args) {
		String line = "Aa Zz";
		//a-z 97-122 A-Z 65-90

		char[] charArray = line.toCharArray();
		int i = 97;
		while(i<123){
			System.out.println((char)i);
			i++;
		}
		
		int j = 65;
		while(j<91){
			System.out.println((char)j);
			j++;
		}
			
		System.out.println(97-65);
		/*
		for(char c:charArray) 
			System.out.println((int)c);
		*/
	
	}
}
