package week4.ex1;

public class calculate {
public static void main(String[] args) {
		Deck d = new Deck();
		d.shuffle();
		for(int i=1;i<=52;i++)
		{
			System.out.printf("%-19s",d.deal());	//자동으로 toString함수를 불러온다.
			if( i%4==0)
				System.out.println();
		}
		
		
	}
}
