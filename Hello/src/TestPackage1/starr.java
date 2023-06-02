package TestPackage1;

public class starr {

	public static void main(String[] args) {
		
		int line=15;
		for(int a=line;a>=1;a--)
		{
			for(int c=(line-1);c>=a;c--)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++)
			{
			 System.out.print("*");
			}
			System.out.println();
		}

	}

}
