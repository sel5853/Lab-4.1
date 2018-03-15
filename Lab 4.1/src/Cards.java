
public class Cards {

	String rank;
	String suit;
	int pointValue;
			
	public void card(String rank, String suit, int pointValue)
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
	
	public boolean equals(a, b)
	{
		if(a.equals(b))
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return ;
	}
}
