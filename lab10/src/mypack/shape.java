package mypack;
public class shape 
{
	public double r = 5.0;
	public void area()
	{
		System.out.println("Area of the circle is : "+(Math.PI*r*r));
	}
}
class square
{
	private double s = 3;
	public void area()
	{
		System.out.println("Area of the Square : "+(s*s));
	}
}
class rectangle
{
	private double l = 5, b = 2;
	public void area()
	{
		System.out.println("Area of the rectangle : "+(2*l*b));
	}
}
