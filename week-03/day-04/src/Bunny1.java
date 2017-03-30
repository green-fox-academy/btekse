import java.util.Scanner;

/**
 * Created by Balázs on 2017. 03. 30..
 */

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunny1 {
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
    } else {
      return 2 + earsnum(head -1);
    }
  }
}
