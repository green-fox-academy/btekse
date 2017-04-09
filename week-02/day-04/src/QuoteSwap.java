import java.util.*;

public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
    ArrayList<String> temp = new ArrayList<>();

    temp.add(list.get(list.indexOf("do")));
    list.set(list.indexOf("do"), list.get(list.indexOf("cannot")));
    list.set(list.lastIndexOf("cannot"), temp.get(temp.indexOf("do")));

    String correctQuote = "";

    for (String word : list) {
      correctQuote += word;
      if (word != list.get(list.size() - 1)) {
        correctQuote += " ";
      }
    }

    System.out.println(correctQuote);
    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code

    // Also, print the sentence to the output with spaces in between.



  }
}