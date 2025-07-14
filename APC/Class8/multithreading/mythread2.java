package APC.Class8.multithreading;

public class mythread2 extends Thread{
    public void run(){
        for(int i=0;i<20;i++)
        {
            System.out.println("child class");
        }
    }   
}
