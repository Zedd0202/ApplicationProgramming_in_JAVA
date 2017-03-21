package week3.exSolution;

import java.util.Scanner;

public class Main
{
	private static Scanner input;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();

		int choice = getMenuChoice();
		while (choice != 0)
		{
			try
			{
				switch (choice)
				{
					case 1:
						System.out.print("Enter height: ");
						rectangle.setHeight(input.nextDouble());
						break;
					case 2:
						System.out.print("Enter width: ");
						rectangle.setWidth(input.nextDouble());
						break;
					case 3:
						System.out.println(rectangle.toString());
						break;
				} // end switch
			}
			catch (IllegalArgumentException e)
			{
				System.out.println("Height and width must be 0.0-20.0\n");
			} // end catch

			choice = getMenuChoice();
		} // end while
	} // end main

	private static int getMenuChoice()
	{
		input = new Scanner(System.in);
		System.out.println("1. Set Height");
		System.out.println("2. Set Width");
		System.out.println("3. Print rectangle");
		System.out.println("-1. Exit");
		System.out.print("Choice: ");
		return input.nextInt();
	} // end method getMenuChoice
}