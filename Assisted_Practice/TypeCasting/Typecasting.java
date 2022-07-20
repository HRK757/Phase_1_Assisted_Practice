package typecasting;

public class Typecasting {
public static void main(String[] args) {
System.out.println("Implicit Type Casting");
	
		byte a=7;
		System.out.println("Byte: "+a);
		short b=a;
		System.out.println("Conversion from Byte to Short : "+b);
		
		int c =b;
		System.out.println("Conversion from Short to Int : "+c);
		
		int d=a;
		System.out.println("Conversion from Byte to Int : "+d);
		
		float e=d;
		System.out.println("Conversion from Int to Float: "+e);
		
		double f=e;
		System.out.println("Conversion from Float to double : "+f);
		
		System.out.println("Explicit Type Casting");
		double x=23.6;
		int y=(int)x;
		System.out.println("Conversion from double to int :"+y);
		
}

}
