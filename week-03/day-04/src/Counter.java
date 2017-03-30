import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Balázs on 2017. 03. 30..
 */

// Write a recursive function that takes one parameter: n and counts down from n.

public class Counter {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter your number: ");
    int c = myScanner.nextInt();
    counter(c);
  }

  public static int counter(int n) {
    System.out.println("Number: " + n);
    if (n == 1) {
      return 1;
    } else {
      return counter(n - 1);
    }

  }

}

