/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner; 

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Nate Bachynski
 * 991820281
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * 13 + 1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            // Add card to array
            magicHand[i] = c;
            // Print new card
            System.out.println(c.getValue() + " " + c.getSuit());
        }
    
        //insert code to ask the user for Card value and suit, create their card
        Scanner sc = new Scanner(System.in);
        Card userCard = new Card();
        
        System.out.print("Enter a card value (1-13): ");
        userCard.setValue(sc.nextInt());
        
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        userCard.setSuit(Card.SUITS[sc.nextInt()]);
        
        // and search magicHand here
        boolean isMatching = false;
        int i = 0;
        while(isMatching == false && i<magicHand.length) {
            if(magicHand[i].getValue() == userCard.getValue() && magicHand[i].getSuit() == userCard.getSuit()) {
                isMatching = true;
            }
            i++;
        }
        //Then report the result here
        if(isMatching) {
            System.out.println("Your card is in the magic hand.");
        }
        else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        // add one luckcard hard code 2,clubs
    }
    
}
