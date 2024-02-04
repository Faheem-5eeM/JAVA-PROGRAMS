package LAB_05;

public class MyPoint 
{
	private int x;
	private int y;
    public MyPoint()
    {
    	x = 0;
    	y = 0;
    }
    public MyPoint(int x, int y)
    {
    	this.x = x;
    	this.y = y;
    }
    public void setXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int[] getXY()
    {
    	int[] coordinates = {x,y};
    	return coordinates;
    }
    public String toString()
    {
    	return "("+x+","+y+")";
    }
    public double distance(int x, int y)
    {
    	int xdiff = this.x - x;
    	int ydiff = this.y - y;
    	return Math.sqrt(xdiff*xdiff + ydiff * ydiff);
    }
    public double distance(MyPoint another)
    {
    	int xdiff = this.x - another.x;
    	int ydiff = this.y - another.y;
    	return Math.sqrt(xdiff*xdiff + ydiff * ydiff);
    }
    public double distance()
    {
    	return Math.sqrt(x*x + y*y);
    }
	public static void main(String[] args) 
	{
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(3,4);
		
		System.out.println("Point 1 : "+point1);
		System.out.println("Point 2 : "+point2);
		
		point1.setXY(5, 6);
		
		System.out.println("Point 2 : after setXY(5,6):"+point1);
		
		int[] point2coordinates = point2.getXY();
		System.out.println("Point 2 cooridnates :("+point2coordinates[0]+","+point2coordinates[1]+")");
		
		double distance1 = point1.distance(7,8);
		System.out.println("Distance from Point 1 to (7,8) id : "+distance1);
		
		double distance2 = point1.distance(point2);
		System.out.println("Distance from Point 1 to Point 2 is :"+distance2);
		
		double distance3 = point2.distance();
		System.out.println("Distance from Point 2 to origin is :"+distance3);

	}

}
