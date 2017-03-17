package week3;

import java.util.Scanner;

public class CalculateRectangle {
	public static void main(String[] args) {

		while(true){
			
			Rectangle rec =  new Rectangle();
			Scanner input = new Scanner(System.in);
			while(true)
			{
				System.out.println("          <MENU>         ");
				System.out.println("1 : ENTER HEIGHT ");
				System.out.println("2 : ENTER WIDHT ");
				System.out.println("3 : PRINT ");
				System.out.println("0 : EXIT ");
				int a =  input.nextInt();
				switch(a){
				case 1 :
					double h = input.nextDouble();
					rec.setHeight(h);
					break;
				case 2 :
					double w  = input.nextDouble();
					rec.setWidth(w);
					break;
				case 3 : 
					rec.print(rec.height, rec.width);
					break;
				case 0 :
					break;
					
				}
			}
			




		}



	}
}
