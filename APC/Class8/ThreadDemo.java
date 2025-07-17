class MyThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child class");
            Thread.yield(); // Hint to scheduler to give chance to other threads
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("parent class");

            // Optional: Uncomment if you want delay
           try {
               Thread.sleep(400);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }
    }
}

// This code demonstrates the use of threads in Java.
// The MyThread class extends Thread and overrides the run method.
// The main method creates an instance of MyThread and starts it.
// Both the main thread and the MyThread will print messages to the console.
// The Thread.yield() method is used to suggest to the thread scheduler that the current thread is willing to yield its current use of the CPU.
// The main thread sleeps for a short duration to simulate work and allow the child thread to run
// concurrently.
// The output will show interleaved messages from both threads, demonstrating concurrent execution.
// Note: The actual output order may vary due to the nature of thread scheduling.
// The Thread.sleep() method is used to pause the main thread for a specified time, allowing
// the child thread to execute its run method concurrently.
