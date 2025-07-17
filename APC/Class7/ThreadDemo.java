
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child class");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread(); // Create thread
        t.start();                   // Start the child thread

        for (int i = 0; i < 10; i++) {
            System.out.println("parent class"); // Main thread
        }
    }
}

// This code demonstrates the creation and execution of a thread in Java.
// The MyThread class extends Thread and overrides the run method to print "child class".
// The main method creates an instance of MyThread, starts it, and then prints "parent class" from the main thread.
// The output will interleave messages from both threads, showing concurrent execution.
// The child thread prints "child class" 10 times, while the main thread prints "parent class" 10 times.
// Note: The actual output may vary due to the nature of thread scheduling by the JVM.
