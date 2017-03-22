// #25
// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
/**
 * Created by Balázs on 2017. 03. 22..
 */
import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {

    Scanner myScanner=new Scanner(System.in);

    System.out.println("Enter number #1: ");
    int n1 = myScanner.nextInt();

    System.out.println("Enter number #2: ");
    int n2 = myScanner.nextInt();

    if (n2 <= n1) {
      System.out.println("The second number should be bigger");
    }

    else {
      for (int i = n1; i < n2; i++) {
        System.out.println(i);
      }
    }
  }
}
