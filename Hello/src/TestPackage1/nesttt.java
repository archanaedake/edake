package TestPackage1;

public class nesttt {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=5;
		System.out.println("start");
		if(a<c)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("2");
			if(a<b)
			{
				System.out.println("3");
			}
		}
		System.out.println("end");
	}
	

}
