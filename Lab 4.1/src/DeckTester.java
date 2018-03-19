
public class DeckTester {

	public static void main(String[] args)
	{
		String[] suits = {"Diamond", "Clover", "Heart", "Spade"};
		String[] ranks = {"3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace", "2"};
		int[] pointValues = {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		Deck deck = new Deck(ranks, suits, pointValues);
		deck.shuffle();
		System.out.print(deck.deal());
	}
}
