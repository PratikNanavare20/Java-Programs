class MyRunnable implements Runnable	 //By using implements Runnable
{
	public void run()
	{
		for(int i = 0;i < 5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class UseRunnable 
{
	public static void main(String[] args) 
	{
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		//It going to start Threading
		t.start();
		
		{
			for(int i = 0;i < 5;i++)
			{
				System.out.println("Main Thread");
			}
		}

	}
}
