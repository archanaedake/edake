package Logicalprogram;

public class fib2 {
	public static void main(String[] args) {
		
	
	int a=0;
	int b=1;
	int c ;
	System.out.print(a+",");
	System.out.print(b+",");
	
	while(b<1000)
	{
		c=a+b;
		System.out.print(c+",");
		a=b;
		b=c;
	}
}
}

	

