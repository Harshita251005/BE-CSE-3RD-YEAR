class MyThread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child class");
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        Thread t = new Thread(mt);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("parent class");
        }
    }
}
