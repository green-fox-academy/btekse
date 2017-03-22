/**
 * Created by Balázs on 2017. 03. 22..
 */

import java.util.Scanner;

public class AvgOfInput {
  public static void main(String[] args) {

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

    Scanner myScanner = new Scanner(System.in);

    System.out.println("Enter number #1:");
    int a = myScanner.nextInt();

    System.out.println("Enter number #2:");
    int b = myScanner.nextInt();

    System.out.println("Enter number #3:");
    int c = myScanner.nextInt();

    System.out.println("Enter number #4:");
    int d = myScanner.nextInt();

    System.out.println("Enter number #5:");
    int e = myScanner.nextInt();

    System.out.println("Sum: " + (a + b + c + d + e) + ", Average: " + ((a + b + c + d + e)/5));
  }
}
