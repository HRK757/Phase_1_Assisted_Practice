package method;

public class MethodExecution {
	public int multipy(int a,int b) {
		int c=a*b;
		return c;
	}

	public static void main(String[] args) {

		MethodExecution m=new MethodExecution();
		int ans= m.multipy(10,3);
		System.out.println("Multipilcation of numbers :"+ans);
		}
}
