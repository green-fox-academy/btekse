import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
  @Test
  public void getApples() throws Exception {
    Apples applesTest = new Apples("apple");
    assertEquals("apple", applesTest.getApples());
  }

  /*@Test
  public void testHappy() throws Exception {
    Apples appleHappy = new Apples("apple");
    assertFalse(appleHappy.isHappy());
  }*/
}