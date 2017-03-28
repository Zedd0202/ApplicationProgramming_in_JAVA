package week4.ex1;
import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class Deck {
	public int TOTAL_CARDS = 52;
	public Card[] deck = new Card[52];
	
	public Random randGener = new Random();
	public int curCard;
	public int index=0;
	public int index2=0;
	public String[] SUIT_STRING = { "*", "diamond","club","heart","spade"};
	public String[] RANK_STRING = {"*","ace","2","3","4","5","6","7","8","9","10","J","Q","K"};
	public Deck()
	{
		for(int i=1;i<SUIT_STRING.length;i++)
		{
			for(int j=1;j<RANK_STRING.length;j++)
			{
				Card card = new Card(i,j);
				deck[index++]= card;
			}
		}
	}
	
	public void shuffle()
	{
//		for(int i=0;i<52;i++)
//		{
//			int rand = randGener.nextInt(52);
//			Card temp = deck[i];
//			deck[i]= deck[rand];
//			deck[rand]=temp;
//			
//			
//		}
		Collections.shuffle(Arrays.asList(deck));


	}
	public Card deal()
	{
		
		return deck[curCard++];
		
	}
	

}
//		Random randomGenerator = new Random();
