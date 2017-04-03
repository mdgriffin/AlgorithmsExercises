package mdgriffin.me.CA2015;


import java.util.Arrays;
import java.util.Iterator;


public class Hand {
    private int size; //will be 5 for poker hand
    private Card [] cards;
    private int numberOfCards = 0;  //will be incremented as cards are addded to hand

    public Hand(int size){
        this.size = size;
        cards = new Card[size];
    }

    public void addCard(Card c){
        //adds a card to the hand
        // at most size cards should be added
        if (numberOfCards < size) {
            cards[numberOfCards] = c;
            numberOfCards ++;
        }
    }

    public  boolean isStraight(){
        //sortCards();

        Arrays.sort(cards);

        // there must be at least 5 cards
        if (numberOfCards == size) {

            int lastVal = cards[0].getFace();

            for (int i = 1; i < numberOfCards; i++) {
                if (cards[i].getFace() == lastVal + 1) {
                    lastVal++;
                } else {
                    return false;
                }
            }

        }

        return true;
    }

    public boolean isFourOfAKind() {


        for (int i = 0; i < size; i++) {
            int numOccurences = 0;
            for (int j = i; j < size; j++) {
                if (cards[i].getFace() == cards[j].getFace()) {
                    numOccurences++;
                }
            }

            if (numOccurences == 4) {
                return true;
            }
        }

        return false;

    }
}