package Homework2;
import java.util.Scanner;
import java.util.Random;

public class homework2 {

	public static void main(String[] args) {
		int rIdx =0;
		int cIdx=0;

		int []dx={-1,0,1,1,1,0,-1,-1};
		int []dy={1,1,1,0,-1,-1,-1,0};

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number rows: ");
		int p = input.nextInt();
		System.out.print("Enter the number of columns: ");
		int q = input.nextInt();
		System.out.print("Enter the number of bomb: ");
		int r = input.nextInt();
		if(r>p*q)
			return;
		char array[][] = new char[p][q];
		Random randomGenerator = new Random();
		for(int i=0;i<r;i++)
		{

			rIdx = randomGenerator.nextInt(p);
			cIdx = randomGenerator.nextInt(q);
			if(array[rIdx][cIdx]=='*')
			{
				i--;
				continue;
			}
			else
				array[rIdx][cIdx]='*';
		}
		int cnt =0;
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				cnt=0;
				if(array[i][j]=='*')
					continue;
				for(int k=0;k<8;k++)
				{
					int nextr=0;
					int nextc=0;

					nextr = i+dy[k];
					nextc = j+dx[k];
					if(nextr<0 || nextc<0 || nextr>=p|| nextc>=q)
						continue;
					else if(array[nextr][nextc]=='*')
						cnt++;
					else
						continue;

				}

				char realCnt = Character.forDigit(cnt, 10);  
				if(cnt==0)
					array[i][j]='-';
				else
					array[i][j]=realCnt;
			}
		}
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}



	}



}
