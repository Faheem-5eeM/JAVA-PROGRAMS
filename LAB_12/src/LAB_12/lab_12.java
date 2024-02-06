package LAB_12;
class MyThread extends Thread
{
	public MyThread(String ThreadMessage)
	{
		super(ThreadMessage);
	}
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(getName()+" : count "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex);
			}
			
		}
		System.out.println(getName()+" has finished.");
	}
}

public class lab_12 
{

	public static void main(String[] args) 
	{
		MyThread child = new MyThread("child process");
		child.start();
	
			for(int i=0;i<5;i++)
			{
				System.out.println("Main process : count "+i);
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException ex)
				{
					System.out.println(ex);
				}
				
			}
			System.out.println("Main process has finished.");

	}

}
