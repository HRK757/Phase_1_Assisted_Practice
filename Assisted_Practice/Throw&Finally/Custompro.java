package exphand;

class Myexp extends Exception {
    public Myexp(String s) 
    { 
        super(s); 
    } 
} 
public class Custompro 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new Myexp("temp"); 
        } 
        catch (Myexp ex) 
        { 
            System.out.println("Found"); 
            System.out.println(ex.getMessage()); 
        } 
    } 


}
