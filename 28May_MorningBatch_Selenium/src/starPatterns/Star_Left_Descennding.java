package starPatterns;

public class Star_Left_Descennding {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)  //For printing Row
		{
			for(int a=5; a>=i; a--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
