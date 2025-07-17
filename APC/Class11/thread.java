class Thread1 extends Thread{
	
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			thread.counter();
		}
	}
}
class Thread2 extends Thread{
	
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			thread.counter();
		}
	}
}
public class thread {
    static int count=0;
	
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println(count);
		
		
	}
	
	public static synchronized void counter()
	{
		count++;
	}
	
// Output will show the final value of count after both threads have completed execution.
// The output will be 2000, as both threads increment the count variable 1000
}

// times each, and the synchronized method ensures that the increments are thread-safe.
// The use of join() ensures that the main thread waits for both t1 and t2 to finish before printing the final count.
// The synchronized keyword ensures that only one thread can execute the counter method at a time, preventing
