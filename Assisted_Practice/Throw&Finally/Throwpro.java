package exphand;

public class Throwpro {
    public static void main(String[] args)
    {

        int a=32,b=0,c;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                c = a / b;
                System.out.print("\nThe result is : " + c);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }

        System.out.print("\nEnd of program.");
    }


}
