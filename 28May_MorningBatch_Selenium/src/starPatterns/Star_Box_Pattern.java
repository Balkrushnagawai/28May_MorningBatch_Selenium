package starPatterns;

public class Star_Box_Pattern {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)     // For column printing
		{
			for(int a=1; a<=5; a++)   // For row printing
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
