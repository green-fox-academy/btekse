import java.util.Scanner;

/**
 * Created by Balázs on 2017. 03. 30..
 */
// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
public class Bunny2 {

  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter bunnies number: ");
    int bh = myScanner.nextInt();
    System.out.println("Bunnies ears: " + earsnum(bh) + ".");
    earsnum(bh);
  }

  public static int earsnum(int head) {
    if (head == 1) {
      return 2;
      }
      else if (head%2 == 0) {
      return 3 + earsnum(head-1);
      }
      else {
      return 2 + earsnum(head -1);
    }
  }
}
