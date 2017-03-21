package week3.exSolution;


public class Rectangle
{
	private double height; // the height of the rectangle
	private double width; // the width of the rectangle

	// constructor without parameters
	public Rectangle()
	{
		// this.height = 1.0;
		// this.width = 1.0;
		this(1.0, 1.0);
	}

	// constructor with height and width supplied
	public Rectangle(double height, double width)
	{
		// this.height = height;
		// this.width = width;
		setHeight(height);
		setWidth(width);
	}

	// validate and set height
	public void setHeight(double height)
	{
		if (height > 0.0 && height < 20.0)
			this.height = height;
		else
			throw new IllegalArgumentException("height is out of range");
	}

	// validate and set width
	public void setWidth(double width)
	{
		if (width > 0 && width < 20.0)
			this.width = width;
		else
			throw new IllegalArgumentException("width is out of range");
	}

	// calculate rectangle's perimeter
	public double getPerimeter()
	{
		return (2 * height + 2 * width);
	}

	// calculate rectangle's area
	public double getArea()
	{
		return height * width;
	}

	// convert to String
	public String toString()
	{
		return String.format("%s: %f\n%s: %f\n%s: %f\n%s: %f", "Height", height, "Width", width, "Perimeter", getPerimeter(), "Area", getArea());
	}
}
