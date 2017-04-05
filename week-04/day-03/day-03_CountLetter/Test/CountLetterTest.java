import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Balázs on 2017. 04. 05..
 */
public class CountLetterTest {
  @Test
  public void countLetter() throws Exception {
    CountLetter text = new CountLetter("blablaablak");

    Map<String, Integer> x = new HashMap<>();
    x.put("b", 3);
    x.put("l", 3);
    x.put("a", 4);
    x.put("k", 1);

    assertEquals(x, text.countLetter());
  }

}