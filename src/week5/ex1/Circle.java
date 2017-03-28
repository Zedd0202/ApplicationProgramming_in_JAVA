package week5.ex1;

public class Circle extends TwoDimensionalShape {
	
	static final String CLASS_NAME = "Circle";
	//super는 메인에서 못씀. child의 부분에서 쓸 수 있다. 오버라이딩한거 쓰고싶지않고 부모꺼 쓰는 방법은없음. 트릭이 있긴함 자식 메소드에서 super로 부르는 방법있긴
	
	String name;
	
	
	public Circle(String name, double r) {
		super(name, r, r);
	}
	public String getClassName(){
		
		return Circle.CLASS_NAME;
	}
	public void setRadius(double radius){
		this.dimension1 = radius;
	}
	public double getRadius()
	{
		return this.dimension1;
	}
	public void setDiameter(double dimeter)
	{
		this.dimension2 =  2*dimeter;
		
	}
	public double getDiameter()
	{
		return this.dimension2;
		
	}
	public double getArea()
	{
		return Math.PI*this.dimension1*this.dimension2;
	}
	@Override 
	public String toString() {
		return String.format("%s is a [%s], and is a [%s] \n CirObject1's area is %.2f, radius is %.2f, diameter is %.2f",super.getName(), getClassName(), super.getClassName(), getArea(),getRadius(),getDiameter());
	
		}

	
	
}
