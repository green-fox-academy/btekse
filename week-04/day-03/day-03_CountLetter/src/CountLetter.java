import java.util.HashMap;
import java.util.Map;

/**
 * Created by Balázs on 2017. 04. 05..
 */
public class CountLetter {
  String text;

  public CountLetter(String text) {
    this.text = text;
  }
  public Map countLetter() {
    Map<String, Integer> map = new HashMap<>();
    char[] charText = text.toCharArray();

    for (char c : charText) {
      if (!map.containsKey(String.valueOf(c))) {
        map.put(String.valueOf(c), 1);
      } else {
        Integer counter = map.get(String.valueOf(c));
        map.put(String.valueOf(c), counter + 1);
      }
    }
    return map;
  }
}
