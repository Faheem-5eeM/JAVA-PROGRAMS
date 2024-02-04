package LAB_06;
abstract class Shape
{
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
}
class Circle extends Shape
{
	private double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	@Override
	public double calculateArea()
	{
			return Math.PI*radius*radius;
	}
	@Override
	public double calculatePerimeter()
	{
			return 2*Math.PI*radius;
	}
	
}
class Triangle extends Shape
{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	@Override
	public double calculateArea()
	{
		double s = (side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
	}
	@Override
	public double calculatePerimeter()
	{
		return side1+side2+side3;
	}
	
}


public class lab_06 
{

	public static void main(String[] args) 
	{
		double radius = 4.0;
		double ts1 = 3.0, ts2 = 4.0 , ts3 = 5.0;
		Circle circle = new Circle(radius);
		Triangle triangle = new Triangle(ts1,ts2,ts3);
		
		System.out.println("Radius of the circle is :"+radius);
		System.out.println("3 Sides of the Triangle :"+ts1+", "+ts2+", "+ts3); 
		
		System.out.println("Area of the circle is :"+circle.calculateArea());
		System.out.println("Perimeter of the circle is :"+circle.calculatePerimeter());
		
		System.out.println("Area of the Triangle is :"+triangle.calculateArea());
		System.out.println("Perimeter of the Triangle is :"+triangle.calculatePerimeter());
		

	}

}
