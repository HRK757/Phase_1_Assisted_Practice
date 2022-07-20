package com.constructor;

public class ConstructorEmployee {
		int empId;
		String empName;
		String department;
		float salary;
		
		//default constructor
		public ConstructorEmployee() {
			empId=123;
			empName="xyz";
			department="finance";
			salary=35000;
		}
		
		//parametrized constructor
		public ConstructorEmployee(int empId,String empName,String department,float salary) {
			this.empId=empId;
			this.empName=empName;
			this.department=department;
			this.salary=salary;
		}
		
		public void display() {
			System.out.println("Id: "+empId);
			System.out.println("Name: "+empName);
			System.out.println("Department: "+department);
			System.out.println("Salary: "+salary);
			System.out.println();
			
		}
		
		public static void main(String[] args) {
			
			ConstructorEmployee e1= new ConstructorEmployee();
			ConstructorEmployee e2= new ConstructorEmployee(567, "abc", "Training", 50000); 

			//calling default constructor
			e1.display();
			//calling parametrized constructor
			e2.display();
			
			 
		
		}


}
