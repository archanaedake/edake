package TestPackage1;

public class staticadd {
	static int add (int x, int y)
	{
		int sum =x+y;
		return sum;
	}
	public static void main(String[] args) {
		int result = add( 12,45);
		    result= add(result,85);
		result=add(result,74);
		result=add(result,35);
		System.out.println(result);
		
	}
	}
	


