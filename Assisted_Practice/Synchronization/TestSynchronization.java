package syn;

public class TestSynchronization {
public static void main(String[] args) {
		
		Sender sender = new  Sender();
		
		User t1= new User("Hello", sender);
		User t2= new User("Hi",sender);
		
		t1.start();
		t2.start();
	}
}
