class MyThread extends Thread //Create Thread By using Extending Thread
{
	public void run()
	{
		for(int i = 0;i < 5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}

public class UseThread 
{

	public static void main(String[] args) 
	{
		MyThread m = new MyThread();
		//It going to start Threading
		m.start();                       //2 thread
		
		for(int i = 0;i < 5;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
