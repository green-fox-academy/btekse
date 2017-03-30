import java.util.Scanner;

/**
 * Created by Balázs on 2017. 03. 30..
 */

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
  public static void main(String[] args) {
    System.out.println(power(3, 3));
  }

  public static int power(int num, int y) {
    if (y == 0) {
      return 1;
    } else {
      return num * power(num, y - 1);
    }
  }
}