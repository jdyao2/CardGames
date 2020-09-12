/************************************************************ 
** Sarah Yao                                               ** 
** Project Name : Unit4 Lab6 / Elevens Lab                 **
** Program Name : CardInterface.java                       **
** Course       : AP Computer Science /Period 2            **
** Create Date  : 11/20/15                                 **
*************************************************************/
// represents a playing card.
public interface CardInterface {

// Make sure your class has appropriate fields

/* Your class must have a constructor that takes three 
   * parameters:
    * aStringvaluecontaining the rank of the card
    * a String valuecontaining the suit of the card
    * an int valuecontaining the point value of the card
    */

public String getSuit();

public String getRank() ;

public int getPointValue();

/** Compare this card with the argument.
*  Return true if the rank, suit, and point value of this 
* card are equal to those of argument; false otherwise.
    */
public boolean equals(CardInterface otherCard);

/** Returns a String containing the rank, suit, and point 
      * value in the format
*     "[Rank] of [Suit] (point value = [PointValue])".
      */
public String toString() ;

}
