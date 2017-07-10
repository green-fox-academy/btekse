import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {
  @Test
  public void stringReverserTest() throws Exception {
    assertEquals("tset", Reverse.stringReverser("test"));
  }


}