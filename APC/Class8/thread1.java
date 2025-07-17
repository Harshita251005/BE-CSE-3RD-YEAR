class MyThread1 implements Runnable{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child class");
		}
	}

}
public class thread1 {
    public static void main(String[] args) {
		
		MyThread1 mt1 = new MyThread1();
//		mt1.start();
		
		Thread t = new Thread(mt1);
		
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("parent class");
		}
	}
}

// Output will show interleaved execution of parent and child class messages
// depending on the thread scheduling by the JVM.
// The child class messages will be printed by the MyThread1's run method,
// while the parent class messages will be printed by the main method of the thread1 class.
// Note: The start() method is called on the Thread object, not on the Runnable object.
// If you uncomment mt1.start(), it will cause a compilation error because Runnable does not have a start() method.

// The output will show "child class" and "parent class" printed in an interleaved manner,
// demonstrating the concurrent execution of the two threads.