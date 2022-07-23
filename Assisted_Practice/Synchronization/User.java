package syn;

public class User extends Thread {
	String msg;
	Sender sender;
	
	public User(String msg, Sender sender) {
		
		this.msg=msg;
		this.sender=sender;
	}
	
	public void run() {
		System.out.println( msg);
		
		//without synchronization
	    //sender.send(msg);
	    
	    //with synchronization
	    synchronized(sender) {
	    	sender.send(msg);
	    }
	}

}
