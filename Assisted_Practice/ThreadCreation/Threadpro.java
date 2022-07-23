package thrpro;


	public class Threadpro extends Thread
	{
	 	public void run()
	 	{
	  		System.out.println("Thread is running");
	}
	 	public static void main( String args[] )
	 	{
	  		Threadpro t1 = new  Threadpro();
	  		t1.start();
	 	}
}
