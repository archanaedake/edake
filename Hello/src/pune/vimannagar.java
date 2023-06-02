package pune;

import mumbai.Dadar;

public class vimannagar extends Dadar {
	public static void main(String[] args) {
		Dadar x = new Dadar();
		Dadar y = new Dadar(45);
		//Dadar z = new Dadar ("velocity");
		Dadar m = new Dadar ( 12 , '$');
		
		System.out.println(x.a);
		System.out.println(y.a);
		//System.out.println(z.a);
		System.out.println(m.a);
	}
		
}
