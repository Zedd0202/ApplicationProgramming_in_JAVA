package week5.ex1;

public class TwoDimensionalShape {

	static final String CLASS_NAME = "2D Shape";
			String name;
			double dimension1;
			double dimension2;
			TwoDimensionalShape (String name, double d1, double d2){
				this.name = name;
				this.dimension1 = d1;
				this.dimension2 = d2; 
			}
			public String getClassName(){
				return TwoDimensionalShape.CLASS_NAME;
			}
			public String getName()
			{
				return this.name;
			}
			
			public double getDimension1() {
				return dimension1;
			}
			public void setDimension1(double dimension1) {
				this.dimension1 = dimension1;
			}
			public double getDimension2() {
				return dimension2;
			}
			public void setDimension2(double dimension2) {
				this.dimension2 = dimension2;
			}
			public double getArea()
			{
				return 0.0;
			}
			
			
			
}
