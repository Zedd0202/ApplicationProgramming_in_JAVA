package week4.ex1;

public class Card {
	public static int DIAMOND;
	public static int CLUB;
	public static int HEART;
	public static int SPADE;
	public String[] SUIT_STRING = { "*", "diamond","club","heart","spade"};
	public String[] RANK_STRING = {"*","ace","2","3","4","5","6","7","8","9","10","J","Q","K"};
	public int rank;//1~13
	public int suit;//1~4
	
	

	public Card(int suit, int rank)
	{
		this.rank = rank;
		this.suit = suit;
	 
		
		
	}
	public int getRank(){
		return this.rank;
		
	}
	public void setRank(int rank)
	{
		this.rank = rank;
	}
	public int getSuit(){
		return this.suit;
	}
	public void setSuit(int suit){
		this.suit = suit;
		
	}
	public String toString()
	{
		String str = "";
		str = RANK_STRING[this.getRank()] +" of " + SUIT_STRING[this.getSuit()];
		return str;
		
	}
	

}
