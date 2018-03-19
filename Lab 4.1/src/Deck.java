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
		if(unDealt.size() == 0)
		{
			return null;
		}
		else
		{
			dealt.add(unDealt.get(0));
			unDealt.remove(0);
			return unDealt.get(0);
		}
	}
	
	public void shuffle()
	{
		for(int x = 0; x < dealt.size(); x++)
		{
			unDealt.add(dealt.get(x));
			dealt.remove(0);
		}
		
		for(int k = 51; k > 0; k--)
		{
			int r = (int)(Math.random() * k + 1);
			Card a = unDealt.get(k);
			Card b = unDealt.get(r);
			unDealt.set(k, b);
			unDealt.set(r, a);
		}
	}
}
