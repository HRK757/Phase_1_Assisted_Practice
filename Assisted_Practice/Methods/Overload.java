package method;

public class Overload {
	public void area(int b,int h)
    {
         System.out.println("Area of Rectangle :"+ (b*h));
    }
	public void area(int s )
	{
		System.out.println("Area of Square :" + (s*s));
	}
    public void area(double r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

Overload o=new Overload();
       o.area(15,18);
       o.area(9);
       o.area(7.5);  
   }
}
	
