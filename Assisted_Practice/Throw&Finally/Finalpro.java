package exphand;

public class Finalpro {
    public static void main(String[] args)
    {	
        int a=29,b=0,c=0;
        try
        {
            c= a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\nThe result is : " + c);
        }
    }

}
