import java.util.*;

public class Deck {

	ArrayList<Cards> unDealt = new ArrayList<Cards>();
	ArrayList<Cards> dealt = new ArrayList<Cards>();
	
	public static void deck(String[] rank, String[] suit, int[] pointValue)
	{
		for(int x = 0; x < rank.length; x++)
		{
			for(int y = 0; y < suit.length; y++)
			{
				unDealt.add(new Cards(rank[x], suit[y], pointValue[x]));
			}
		}
	}
}
