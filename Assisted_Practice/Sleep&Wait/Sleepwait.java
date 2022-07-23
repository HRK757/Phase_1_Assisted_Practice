package sleepw;

public class Sleepwait {
    private static Object lck = new Object();
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(1000);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping some time");
        synchronized (lck) 
        {
            lck.wait(1000);
            System.out.println("Object '" + lck + "' is woken after some time");
        }
    }


}
