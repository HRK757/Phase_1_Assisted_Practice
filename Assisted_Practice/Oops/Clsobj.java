package oops;

public class Clsobj {
	
	    String name; 
	    String breed; 
	    int age; 
	    String color; 
	    public Clsobj(String name, String breed, int age, String color) 
	    { 
	        this.name = name; 
	        this.breed = breed; 
	        this.age = age; 
	        this.color = color; 
	    } 
	    public String getName() 
	    { 
	        return name; 
	    } 
	    public String getBreed() 
	    { 
	        return breed; 
	    } 
	    public int getAge() 
	    { 
	        return age; 
	    } 
	    public String getColor() 
	    { 
	        return color; 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return("Hi the dog is "+ this.getName()+ ".\nThe dog breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and  "+ this.getColor() + "."); 
	    } 
	    public static void main(String[] args) 
	    { 
	        Clsobj c = new Clsobj("Scott","papillon", 5, "black"); 
	        System.out.println(c.toString()); 
	    } 

}
