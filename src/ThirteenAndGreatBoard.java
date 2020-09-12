/* The ThirteenAndGreatBoard class represents the board in a game of ThirteenAndGreater.
 */
import java.util.*;

public class ThirteenAndGreatBoard extends Board{
	   /** The size (number of cards) on the board.
	    */
	   private static final int BOARD_SIZE = 6;

	   /**
	    * The ranks of the cards for this game to be sent to the deck.
	    */
	   private static final String[] RANKS =
	      {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	   /**
	    * The suits of the cards for this game to be sent to the deck.
	    */
	   private static final String[] SUITS =
	      {"spades", "hearts", "diamonds", "clubs"};

	   /**
	    * The values of the cards for this game to be sent to the deck.
	    */
	   private static final int[] POINT_VALUES =
	      {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};


	   /**
	    * Flag used to control debugging print statements.
	   */
	   //private static final boolean I_AM_DEBUGGING = false;

	   /**
	    * Creates a new <code>ElevensBoard</code> instance.
	    */
	   public ThirteenAndGreatBoard() {
		   super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
;
	   }

	   /**
	    * Determines if the selected cards form a valid group for removal.
	    * In Elevens, the legal groups are (1) a pair of non-face cards
	    * whose values add to 11, and (2) a group of three cards consisting of
	    * a jack, a queen, and a king in some order.
	    * @param selectedCards the list of the indices of the selected cards.
	    * @return true if the selected cards form a valid group for removal;
	    *         false otherwise.
	    */
	   public boolean isLegal(List<Integer> selectedCards) {
	      /* *** TO BE IMPLEMENTED FOR ALL GAMES *** */
		  boolean retVal = true;
		  int sum = 0;
		  
		 for ( Integer I : selectedCards)
		 {
			 sum += cardAt(I.intValue()).getPointValue();
		 }
		 if (sum >= 13 && selectedCards.size() ==2)
			 retVal = true;
		 else
			 retVal = false;
		  
		  return retVal;
	   }

	   /**
	    * Determine if there are any legal plays left on the board.
	    * In Elevens, there is a legal play if the board contains
	    * (1) a pair of non-face cards whose values add to 11, or (2) a group
	    * of three cards consisting of a jack, a queen, and a king in some order.
	    * @return true if there is a legal play left on the board;
	    *         false otherwise.
	    */
	   public boolean anotherPlayIsPossible() {
	      /* *** TO BE IMPLEMENTED FOR ALL GAMES *** */
		   boolean retVal = true;
		   
		   retVal = containsPairThirteenAndGreater(cardIndexes());
			  
		   return retVal;
	   }


	   /**
	    * Check for an 11-pair in the selected cards.
	    * @param selectedCards selects a subset of this board.  It is list
	    *                      of indexes into this board that are searched
	    *                      to find an 11-pair.
	    * @return true if the board entries in selectedCards
	    *              contain an 11-pair; false otherwise.
	    */
	   private boolean containsPairThirteenAndGreater(List<Integer> selectedCards) {
	      /* *** TO BE IMPLEMENTED FOR ELEVENS GAME *** */
		  
			  for(int i =0; i<selectedCards.size()-1; i++)
				  for(int j=i+1; j<selectedCards.size(); j++)
				  {
					  if( (cardAt(selectedCards.get(i).intValue()).getPointValue() + 
						   cardAt(selectedCards.get(j).intValue()).getPointValue())  >= 13)
						  return true;
						  
				  }
			  return false;
	   }


}
