package APC.Class8.multithreading;

public class thread2 {
    public static void main(String[] args){
        mythread2 mt = new mythread2();
        mt.start();
        try{
            mt.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Join method not workiing");
        }
        
    }
}
