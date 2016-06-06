package string;

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		String s="hello";
		int exp = (int) Math.pow(2, s.length());
		
		for(int i=0;i<(exp/2);i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(j==0)
				{
					System.out.print(s.charAt(j));
					continue;
				}
				
				int check=1<<j-1 & i;
				if(check>=1)
				{
					System.out.print(" "+s.charAt(j));
				}
				else
				{
					System.out.print(s.charAt(j));
				}
			}
			System.out.print("\n");
		}
	}
}