import java.util.Arrays;

/**
 * Created by Balázs on 2017. 04. 05..
 */
public class Anagram {
  String text1;
  String text2;

  public Anagram(String text1, String text2) {
    this.text1 = text1;
    this.text2 = text2;
  }

  public boolean isAnagram() {
    char[] text1Array = text1.toCharArray();
    char[] text2Array = text2.toCharArray();

    Arrays.sort(text1Array);
    Arrays.sort(text2Array);

    text1 = Arrays.toString(text1Array);
    text2 = Arrays.toString(text2Array);

    return text1.equalsIgnoreCase(text2);
  }
}
