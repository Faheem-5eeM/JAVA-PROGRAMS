package LAB_08;
class outer
{
	public void display()
	{
		System.out.println("we are inside Outer method.");
	}
	class inner
	{
		public void display()
		{
			System.out.println("We are inside Nested Method");
		}
	}
}
public class lab_08 
{

	public static void main(String[] args) 
	{
		outer.inner in = new outer(). new inner();
		in.display();
		outer x = new outer();
		x.display();

	}

}
