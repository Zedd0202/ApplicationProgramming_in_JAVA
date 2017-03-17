package week3;
/*
 * @version 2017.03
 * @author CHOI songyi 
 */
public class Rectangle {
	public double height;
	public double width;
	public Point point;
	
	public Rectangle() {
		super();
		this.height = height;
		this.width = width;
		this.point = new Point(0,0);
		
		
	}
	public Rectangle(double h, double w, Point point)
	{
		setHeight(h);
		setWidth(w);
		setPoint(point);
		
	}
	
	public void setHeight(double height)
	{
		if(height>0.0 && height <20.0)
		this.height = height;
		else
			System.out.println("error");
		
	}
	public void setWidth(double width)
	{
		if(height>0.0 && height <20.0)
			this.width = width;
		else
			System.out.println("error");
		
	}
	public double getPerimeter(double h, double w)
	{
		double perimeter = 2*h + 2*w;
		return perimeter;
	}
	public double getArea(double h, double w)
	{
		double area =  w*h;
		return area;
	}
	public void print(double h, double w)
	{
		System.out.println("Perimeter" + getPerimeter(h,w));
		System.out.println("Area " + getArea(h,w));
	}
	public void setPoint(Point point)
	{
		this.point = point;
	}
}
