package APC.Class8.multithreading;

public class mythread {
    public static void main(String[] args) {
        mythread1 mtt = new mythread1();
        Thread t = new Thread(mtt);
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("Parent child");
        }
    }
}
