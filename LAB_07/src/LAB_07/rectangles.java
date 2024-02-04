package LAB_07;
interface Resizable
{
	public void resizeWidth();
	public void resizeHeight();
}
class Rectangle implements Resizable
{
	private int width;
	private int height;
	
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public void resizeWidth(int width)
	{
		this.width = width;
	}
	
	public void resizeHeight(int height)
	{
		this.height = height;
	}
	public void printSize()
	{
		  System.out.println("Height: "+height+" Width: "+width);
	}
	
}
public class rectangles 
{

	public static void main(String[] args) 
	{
		Rectangle rectangle = new Rectangle(100,150);
		rectangle.printSize();
		rectangle.resizeWidth(150);
		rectangle.resizeHeight(200);
		rectangle.printSize();
	}

}
