/************************************************************ 
** Sarah Yao                                               ** 
** Project Name : Unit4 Lab6 / Elevens Lab                 **
** Program Name : Card.java                                **
** Course       : AP Computer Science /Period 2            **
** Create Date  : 11/20/15                                 **
*************************************************************/
public class Card implements CardInterface
{
   private String rank;
   private String suit;
   private int pointValue;
   
   public Card(String r, String s, int v)
   {
      rank = r;
      suit = s;
      pointValue = v;
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
   
   public boolean equals(CardInterface otherCard)
   {
      Card c = (Card)otherCard;
      
      return rank.equals(c.getRank()) && suit.equals(c.getSuit()) && pointValue==c.getPointValue();
   }
   
   public String toString()
   {
      return getRank()+" of "+getSuit()+" (point value = " + getPointValue()+").";
   }         
   
}