package method;

public class CallByValue {
		int num=30;

		int operation(int num) {
			this.num =num*10/100;
			return(num);
		}

		public static void main(String args[]) {
			CallByValue c = new CallByValue();
			System.out.println("Before operation value of data is "+c.num);
			c.operation(750);
			System.out.println("After operation value of data is "+c.num);
			}
		}
