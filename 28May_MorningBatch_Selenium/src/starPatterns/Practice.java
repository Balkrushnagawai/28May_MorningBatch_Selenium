package starPatterns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main (String[]args)//Horizontal Star
	{
		for(int i=0; i<10; i++)
		{
			System.out.print("*");
		}
		System.out.println("------------------->");
		for(int a=1; a<=10; a++)
		{
			System.out.println("*");
		}
		System.out.println("-------------------->");
		for(int b=1; b<=10;b++)
		{
			for(int a=1; a<=6; a++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		System.out.println("-------------------->");
		for(int a=1; a<=10;a++)
		{
			for(int b=1;b<=7;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------->");
		for(int a=1; a<=10;a++)
		{
			for(int b=1; b<=a;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------->");
		for(int a=1; a<=10;a++)
		{
			for(int b=a; b<=10;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------->");
		for(int a=1; a<=7;a++)
		{
			for(int b=a; b<=10-1;b++)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------->");
		for(int a=1; a<=8; a++)
		{
			for(int b=a; b<=8; b++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int c=1; c<=a; c++)
			{
				System.out.print(" ");
			} 	
		}
		System.out.println("-------------------->");
		
		
	}
	

}
