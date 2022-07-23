package thrpro;

public class Threadrun implements Runnable {
    public static int count = 0;
    public Threadrun(){
         
    }
    public void run() {
        while(Threadrun.count <= 10){
            try{
                System.out.println("Expl Thread: "+(++Threadrun.count));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        Threadrun t1 = new Threadrun();
        Thread t = new Thread(t1);
        t.start();
        while(Threadrun.count <= 10){
            try{
                System.out.println("Main Thread: "+(++Threadrun.count));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }

}
