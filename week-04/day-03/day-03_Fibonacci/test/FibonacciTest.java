import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  private Fibonacci fibonacci;

  @Test
  public void testFibonacci() {
    Fibonacci fibTest = new Fibonacci();
    assertEquals(8, fibTest.fibonacci(6));
  }
}
