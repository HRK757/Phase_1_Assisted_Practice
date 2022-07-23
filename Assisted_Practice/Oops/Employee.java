package oops;

 class Encapsulate {
	private String Name; 
    private int EmpId; 
    private int Age;
    public int getAge()  
    { 
      return Age; 
    } 
    public String getName()  
    { 
      return Name; 
    } 
    public int getEmpId()  
    { 
       return EmpId; 
    } 
    public void setAge( int newAge) 
    { 
      Age = newAge; 
    } 
    public void setName(String newName) 
    { 
      Name = newName; 
    } 
    public void setEmpId( int newEmpId)  
    { 
      EmpId = newEmpId; 
    } 
}
public class Employee 
{     
    public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
        obj.setName("abc"); 
        obj.setAge(25); 
        obj.setEmpId(1234); 
        System.out.println("Name: " + obj.getName()); 
        System.out.println("Age: " + obj.getAge()); 
        System.out.println("EmpId: " + obj.getEmpId());      
    } 


}
