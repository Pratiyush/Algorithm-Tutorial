package string;

/*Suppose there are n characters, then there are n-1 positions where a space can be inserted. Each position can either take a 0 (no space) or 1 . So if we just iterate from 0 to n-1 in binary form, we cover all such use cases.
 Eg for ABC, we have 00,01,10,11 correspond to ABC, AB C, A BC, A B C*/
public class StringWithSpace {

	public static void main(String[] args) {
		printComb("abc");
	}

	private static void printComb(String s) {

		if (s == null || s.isEmpty())
			return;
		printComb("a", s, 1);

	}

	private static void printComb(String p, String s, int i) {
		if (s.length() == i)
			System.out.println(p);
		else if (i != 0) {
			printComb(p + s.charAt(i), s, i + 1);
			printComb(p + " " + s.charAt(i), s, i + 1);
		}
	}
}