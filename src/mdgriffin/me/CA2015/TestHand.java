package mdgriffin.me.CA2015;

import java.util.*;

public class TestHand {

    public static void main(String [] args) {

        Hand hand = new Hand(5);

        hand.addCard(new Card(4, "Spade"));
        hand.addCard(new Card(2, "Diamonds"));
        hand.addCard(new Card(5, "Clubs"));
        hand.addCard(new Card(3, "Clubs"));
        hand.addCard(new Card(1, "Hearts"));

        System.out.println(hand.isStraight());

        Hand hand2 = new Hand(5);

        hand2.addCard(new Card(4, "Spade"));
        hand2.addCard(new Card(1, "Diamonds"));
        hand2.addCard(new Card(4, "Clubs"));
        hand2.addCard(new Card(4, "Clubs"));
        hand2.addCard(new Card(4, "Hearts"));


        System.out.println(hand2.isFourOfAKind());
    }


}