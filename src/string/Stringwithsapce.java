package string;

public class Stringwithsapce {

public static void printStrings(String s, int i, String temp, int n)

{

temp = temp + s.charAt(i);

if( i== n-1)

{

System.out.println(temp);

return;

}

//temp = temp + s.charAt(i);

printStrings(s, i+1, temp,n);

temp = temp+ " ";

printStrings(s, i+1, temp,n);

}

public static void main(String[] args) {

// TODO Auto-generated method stub

printStrings("ABC", 0, " ",3);

}

}