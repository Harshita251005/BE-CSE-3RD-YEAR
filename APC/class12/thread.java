class Thread1 extends Thread{
	
	volatile boolean running = true;
	
	public void run()
	{
		System.out.println("Thread started");
		while(running)
		{
			
		}
		System.out.println("thread stopped");
	}
	
	public void stopping1()
	{
		running = false;
	}
}
public class thread {
    public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		
		
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		t1.stopping1();
	}
}

// The code defines a custom thread class that extends Thread.
// It uses a volatile boolean variable to control the running state of the thread.
// The main method starts the thread, sleeps for a second, and then stops the thread by setting the running variable to false.
// The thread prints messages indicating when it starts and stops, demonstrating basic thread control in Java.
