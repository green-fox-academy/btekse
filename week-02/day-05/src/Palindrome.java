/**
 * Created by Balázs on 2017. 03. 24..
 */

import java.util.Scanner;


public class Palindrome {


  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the word: ");
    String reversed = myScanner.next();

    //String reversed = w;

    StringBuilder input = new StringBuilder();
    input.append(reversed);
    input.reverse();

    System.out.println(reversed + input);

  }
}


