package exphand;

public class Throwspro {
    void Division() throws ArithmeticException
    {
        int a=27,b=0,c;
          c = a / b;
        System.out.print("\nThe result is : " + c);
    }
     public static void main(String[] args)
    {
           Throwspro t = new Throwspro();
         try
        {
            t.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }
        System.out.print("\nEnd of program.");
    }


}
