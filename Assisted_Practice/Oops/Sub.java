package oops;

public class Sub {
	
	    public int 	sub(int x, int y) 
	    { 
	        return (x - y); 
	    } 
	    public int sub(int x, int y, int z) 
	    { 
	        return (x - y - z); 
	    } 
	    public double sub(double x, double y) 
	    { 
	        return (x - y); 
	    } 
	    public static void main(String args[]) 
	    { 
	        Sub s = new Sub(); 
	        System.out.println(s.sub(40, 20)); 
	        System.out.println(s.sub(60, 20, 30)); 
	        System.out.println(s.sub(30.5, 20.5)); 
	    } 


}
