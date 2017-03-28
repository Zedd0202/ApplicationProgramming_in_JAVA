package week5.ex1;

public class Rectangle extends TwoDimensionalShape {
	static final String CLASS_NAME = "Rectangle";
	
	public Rectangle(String name, double width, double height){
		super(name, width,height);
	}
	public String getClassName(){
		
		return Rectangle.CLASS_NAME;
	}
	public void setWidth(double width)
	{
		this.dimension1 = width;
		
	} 
	public double getWidth()
	{
		return this.dimension1;
	}
	public void setHeight(int height)
	{
		this.dimension2 = height;
		
	}
	public double getHeight()
	{
		return this.dimension2;
	}
	public double getArea()
	{
		return this.dimension1*this.dimension2;
	}
	@Override public String toString() {
		return String.format("%s is a [%s], and is a [%s] \n  RecObject1's area is %.2f, width is %.2f, height is %.2f",super.getName(), getClassName(), super.getClassName(),getArea(),getWidth(),getHeight());
	}

}
