import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  ArrayList<Card> cards =  new ArrayList<>();

  Deck (int numberOfCards) {
    String[] colors = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    for (int i = 0; i < numberOfCards; i++) {
      cards.add(new Card(colors[i % colors.length], values[(int) (Math.random() * values.length)]));
    }
  }

  void shuffle() {
    Collections.shuffle(cards);
  }

  Card draw() {
    Card temp = cards.get(cards.size() - 1);
    cards.remove(cards.size() - 1);
    return temp;
  }

  public String toString() {
    int noOfSpades = 0;
    int noOfDiamonds = 0;
    int noOfHearts = 0;
    int noOfClubs = 0;
    for (Card card : cards) {
      if (card.color.equalsIgnoreCase("spades")) {
        noOfSpades++;
      } else if (card.color.equalsIgnoreCase("hearts")) {
        noOfHearts++;
      } else if (card.color.equalsIgnoreCase("diamonds")) {
        noOfDiamonds++;
      } else {
        noOfClubs++;
      }
    }
    return String.format("%d cards -  %d Clubs, %d Diamonds, %d Hearts, %d Spades", cards.size(), noOfClubs,
      noOfDiamonds, noOfHearts, noOfSpades);
  }

}
