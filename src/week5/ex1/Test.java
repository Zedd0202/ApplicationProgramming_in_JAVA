package week5.ex1;

public class Test {
	public static void main(String[] args)
	{
		Circle cir1 = new Circle("CirObject1", 3.0);
		Rectangle rec1 = new Rectangle("RecObject1", 3.0, 4.0);
		Square sq1 = new Square("SquareObject1", 6.0);
		System.out.println("Three shapes have been created: ");
		System.out.print("1."+ cir1.toString());
		System.out.println();
		System.out.println();
		System.out.print("2."+ rec1.toString());
		System.out.println();
		System.out.println();
		System.out.println("3."+ sq1.toString());
		System.out.println();
		System.out.println();
		System.out.print("Is SquareObject1 a TwoDimensionalShape?");
		if(rec1 instanceof TwoDimensionalShape)
			System.out.println("true");
		else System.out.println("false");
		System.out.print("Is SquareObject1 a Rectangle?");
		if(sq1 instanceof Rectangle)
			System.out.println("true");
		else System.out.println("false");
		System.out.print("Is SquareObject1 a Square?");
		if(sq1 instanceof Square)
			System.out.println("true");
		else System.out.println("false");
	}
}
