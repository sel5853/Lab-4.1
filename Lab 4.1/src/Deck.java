import java.util.*;

public class Deck {

	ArrayList<Card> unDealt = new ArrayList<Card>();
	ArrayList<Card> dealt = new ArrayList<Card>();
	ArrayList<Deck> deck = new ArrayList<Deck>();
	
	public Deck(String[] rank, String[] suit, int[] pointValue)
	{
		for(int x = 0; x < rank.length; x++)
		{
			for(int y = 0; y < suit.length; y++)
			{
				unDealt.add(new Card(rank[x], suit[y], pointValue[x]));
			}
		}
	}
	
	public boolean isEmpty()
	{
		if(deck.size() == 0)
		{
			return true;
		}
		return false;
	}
	
	public int size()
	{
		return deck.size();
	}
	
	public Card deal()
	{
		if(deck.size() == 0)
		{
			return null;
		}
		else
		{
			return deck.;
			deck.remove(0);
		}
	}
	
	public String shuffle()
	{
		
	}
}
