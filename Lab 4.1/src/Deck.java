import java.util.*;

public class Deck {

	ArrayList<Card> unDealt = new ArrayList<Card>();
	ArrayList<Card> dealt = new ArrayList<Card>();
	
	public static void deck(String[] rank, String[] suit, int[] pointValue)
	{
		for(int x = 0; x < rank.length; x++)
		{
			for(int y = 0; y < suit.length; y++)
			{
				unDealt.add(new Card(rank[x], suit[y], pointValue[x]));
			}
		}
	}
}
