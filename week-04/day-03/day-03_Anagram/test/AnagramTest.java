import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Balázs on 2017. 04. 05..
 */
public class AnagramTest {
  @Test
  public void isAnagram() throws Exception {
    Anagram anagram = new Anagram("baka", "kaba");
    assertEquals(true, anagram.isAnagram());
  }
}