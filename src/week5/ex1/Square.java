package week5.ex1;

public class Square extends Rectangle {
	static final String CLASS_NAME = "Square";
	public Square(String name, double side){
		super(name, side,side);
		
	}
	public String getClassName(){
		
		return Square.CLASS_NAME;
	}
	public void setSide(double side)
	{
		this.dimension1 = side;
		
	}
	public double getSide()
	{
		return this.dimension1;
	}
	@Override public String toString() {
		return String.format("%s is a [%s], and is a [%s] \n  SquareObject1's area is %.2f, side is %.2f",super.getName(), getClassName(), super.getClassName(),getArea(),getSide());		
		}
}
