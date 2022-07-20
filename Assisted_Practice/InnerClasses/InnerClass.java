package inncls;

public class InnerClass {
         void Check(int num) {
		
		
		if(num>=18) {
			
			class Inner {
				
				
				void validate() {
					System.out.println("Validated");
				}
				
				
			}
			
			Inner inner= new Inner();
			inner.validate();


		}
		else {
			
			System.out.println("Not Valid");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		InnerClass in= new InnerClass();
		in.Check(18);
		
		
	}

}
