/************************************************************ 
** Sarah Yao                                               ** 
** Project Name : Unit4 Lab6 / Elevens Lab                 **
** Program Name : Deck.java                                **
** Course       : AP Computer Science /Period 2            **
** Create Date  : 11/20/15                                 **
*************************************************************/
public class Deck implements DeckInterface
{
   private Card[] cards;
   private int nextCard;
   
   public Deck(String[] r, String[] s, int[] v)
   {
      cards = new Card[r.length * s.length];
      int k = 0;
      
      for(int i = 0; i < s.length; i++)
      {
         for(int j = 0; j < r.length; j++)
         {
            cards[k] = new Card(r[j], s[i], v[j]);
            k++;
         }
      }
      
      nextCard = 0;
      
      shuffle();
   }            

   public boolean isEmpty()
   {
      return nextCard >= cards.length;
   }
   
   public int size()
   {
      return cards.length - nextCard;
   }
      
   public void shuffle()
   {
      int r;
      Card temp;
      
      for(int i = cards.length-1; i>=0; i--)
      {
         r = (int)(Math.random()*(i+1));
         temp = cards[i];
         cards[i] = cards[r];
         cards[r] = temp;
      }
      
      nextCard = 0;
   }
   
   public Card deal()
   {
      Card c=null;
      
      if(!isEmpty())
      {
         c = cards[nextCard];
         nextCard++;
      }
      
      return c;
   }
   
   public String toString()
   {
      String s="";
      
      s += size() + ": ";
      
      for(int i=nextCard; i< cards.length; i++)
      {
         s += cards[i] + ", ";
      }
      
      return s;
   }          
}
   