class ThreadPriority extends Thread 
{
	public void run()
	{
		for(int i = 0;i < 5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}

public class UseThreadPriority 
{

	public static void main(String[] args) 
	{
		System.out.println("Main Thread Priority :- "+Thread.currentThread().getPriority());
		ThreadPriority t = new ThreadPriority();
		
		System.out.println("Before Setting Priority Child Thread Priority is :- "+t.getPriority());
		//We are setting the priority
		t.setPriority(8);
		System.out.println("After Setting Priority Child Thread Priority is :- "+t.getPriority());
		//It going to start Threading
		t.start();
		
		for(int i = 0;i < 5;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
