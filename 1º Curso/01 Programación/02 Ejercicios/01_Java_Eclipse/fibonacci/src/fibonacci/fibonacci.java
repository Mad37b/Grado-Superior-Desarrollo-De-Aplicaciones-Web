package fibonacci;

public class fibonacci {

public static void main (String [] arg) {
		
		int a=0;
		int b = 1;
		
		while (a < 1100) {
			int f = a + b;
			 a=b;
			 b=f;
			 
			 a=f;
			 b=a;
			System.out.println(" Número fibonacci :" + f);
			
		}
		
	}
	
}
