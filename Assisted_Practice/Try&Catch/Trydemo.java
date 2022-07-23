package trycat;

public class Trydemo {
public static void main(String[] args) {
		
		
		int a=34,b=0,c;
	
		try {
			c=a/b;
			System.out.println("Result is: "+c);
			
		} catch (ArithmeticException e) {
		
			System.out.println("Error: "+e);
		}
		
	}
}
