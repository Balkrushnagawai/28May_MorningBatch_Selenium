package starPatterns;

import java.util.Iterator;

public class Star_Right_Discending {
	public static void main(String[] args) {
		int line =5;
		for (int i=line; i>=1; i--)
		{
			for(int a=line-1; a>=i; a--)
			{
				System.out.print(" ");
			}
			
			for(int b=1;b<=i; b++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
