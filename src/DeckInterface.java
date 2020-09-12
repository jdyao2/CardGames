/************************************************************ 
** Sarah Yao                                               ** 
** Project Name : Unit4 Lab6 / Elevens Lab                 **
** Program Name : DeckInterface.java                       **
** Course       : AP Computer Science /Period 2            **
** Create Date  : 11/20/15                                 **
*************************************************************/
public interface DeckInterface {

/**You must create at least two fields: an array that
    * contains all the cards in the deck and an int to keep 
    * track of the number of not-yet-dealt cards.
    * Cards are dealt from the top (highest index) down.
    * The next card to be dealt will be at size - 1.
    */

/**You must have a constructor with three parameters that 
    * creates a new Deck. The first parameter is a String 
    * array containing all of the card ranks. The second 
    * parameter is a String array containing all of the card 
    * suits. The third parameter is an int array containing 
    * all of the card point values. The constructor pairs each 
    * element of the first array with each element of the 
    * second array to produce one card to store in the 
    * deck. Lastly, the constructor calls the shuffle method.
*/

/**Determines if this deck is empty (no undealt cards).
    * Returns true if this deck is empty, false otherwise.
    */
public boolean isEmpty(); 

/** Accesses the number of undealt cards in this deck.
* @return the number of undealt cards in this deck.
    */
public int size();

/**Randomly mix the given collection of cards
    * and reset the size to represent the entire deck.
    */
public void shuffle();

/**Deals a card from this deck. Returns the card just 
    * dealt, or null if all the cards have been
    * previously dealt.
    */
public CardInterface deal();

/**Generates and returns a string representing the size 
    * of the remaining deck and all the cards remaining. 
   */
public String toString();
}
