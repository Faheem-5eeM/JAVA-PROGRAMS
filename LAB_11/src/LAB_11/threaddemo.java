package LAB_11;
import java.util.Scanner;
import java.util.Random;
class randThread extends Thread
{
	Random rm = new Random();
	public void run()
	{
		for(int i=0;i<10;i++)
		{
				System.out.println("Random no:"+rm.nextInt(100));
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
class squareThread extends Thread
{
	int num;
	squareThread(int n)
	{
		num=n;
	}
	public void run()
	{
		for(int i=0;i<num;i++)
		{
			System.out.println("Square of :"+i+" is : "+i*i);
		}
	}
}
class cubeThread extends Thread
{
	int num;
	cubeThread(int n)
	{
		num = n;
	}
	public void run()
	{
		for(int i=0;i<num;i++)
		{
			System.out.println("cube of :"+i+"is "+i*i*i);
		}
	}
}


public class threaddemo {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value for n: ");
		int n = s.nextInt();
		
		randThread t1 = new randThread();
		cubeThread t2 = new cubeThread(n);
		squareThread t3 = new squareThread(n);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
