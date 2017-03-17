package week2;

import java.util.Random;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner input = new Scanner(System.in);
		//Random randomGenerator = new Random();
		System.out.print("Enter number of dices: ");
		int p = input.nextInt();
		System.out.print("Enter number of rolls:");
		int q =  input.nextInt();
		System.out.println("Sum		Frequency		Percentage");
		int array[] = new int[p*6+1];
		for(int j=0;j<q;j++)
		{
			sum=0;
			for(int i=0;i<p;i++)
			{
				Random randomGenerator = new Random();

				sum += randomGenerator.nextInt(6)+1;
			}
			array[sum]++;
		}
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
				
				//System.out.print(array[i]);
				System.out.printf("%d		%d			%.2f\n",i,array[i],((double)array[i]/(double)q)*100);
			}
		
		
		}
	}

}
