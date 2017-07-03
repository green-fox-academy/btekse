import java.util.ArrayList;
import java.util.List;

/**
 * Created by Balázs on 2017. 07. 02..
 */
public class LetterFinder {
  public static void main(String[] args) {
    Character letter = 'e';
    String word = "egy aprócska kalapocska benne csacska macska mocska";
    System.out.println(findLetter(letter, word));

  }
  static List<Integer> findLetter (Character letter, String word) {
    List<Integer> listOfIndexes = new ArrayList<>();
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == letter) {
        listOfIndexes.add(i);
      }
    }
    return listOfIndexes;
  }
}
