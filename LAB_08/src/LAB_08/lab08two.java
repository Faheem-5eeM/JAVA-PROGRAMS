package LAB_08;

import LAB_08.outer.inner;

class outer
{
	void display()
	{
		System.out.println("We are inside the outer class");
	}
	class inner
	{
		public void display()
		{
			System.out.println("We are inside nested class");
		}
	}
}

public class lab08two 
{

	public static void main(String[] args) 
	{
		outer.inner x = new outer().new inner();
		x.display();
		
		outer n = new outer();
		n.display();

	}

}
