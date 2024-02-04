package lab03;
class Shape
{
	public void draw()
	{
		System.out.print("\nDrawing a shape.");
	}
	public void erase()
	{
		System.out.print("\nErasing a Shape.");
	}
}
class Circle extends Shape
{
	@Override
	public void draw()
	{
		System.out.print("\nDrawing a Circle.");
	}
	public void erase()
	{
		System.out.print("\nErasing a Circle.");
	}	
}
class Triangle extends Shape
{
	@Override
	public void draw()
	{
		System.out.print("\nDrawing a Triangle.");
	}
	public void erase()
	{
		System.out.print("\nErasing a Triangle.");
	}	
}
class Square extends Shape
{
	@Override
	public void draw()
	{
		System.out.print("\nDrawing a Square.");
	}
	public void erase()
	{
		System.out.print("\nErasing a Square.");
	}	
}

public class lab_03 
{

	public static void main(String[] args) 
	{
		Shape shape1 = new Circle();
		Shape shape2 = new Triangle();
		Shape shape3 = new Square();
		
        System.out.print("\nDemonstrating Polymorphism :\n");
        
        shape1.draw();
        shape1.erase();
        
        
        shape2.draw();
        shape2.erase();
        
        
        shape3.draw();
        shape3.erase();
       
        

	}

}
