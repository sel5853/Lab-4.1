
public class Card {

	String rank;
	String suit;
	int pointValue;
			
	public Card(String rank, String suit, int pointValue)
	{
		this.rank = rank;
		this.suit = suit;
		this.pointValue = pointValue;
	}
	
	public String getRank()
	{
		return rank;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public int getPointValue()
	{
		return pointValue;
	}
	
	public boolean equals(Card a, Card b)
	{
		if(a.equals(b))
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return rank + " of " + suit + " (" + pointValue + ")";
	}
}
