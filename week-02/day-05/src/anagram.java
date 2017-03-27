/**
 * Created by Balázs on 2017. 03. 25..
 */

import java.util.Scanner;


public class anagram {


  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the word #1: ");
    String anagram1 = myScanner.next();

    System.out.println("Enter the word #2: ");
    String anagram2 = myScanner.next();

    StringBuilder input = new StringBuilder();
    input.append(anagram1);
    input.reverse();

    System.out.println(anagram2.equals(input.toString()));

    if (anagram2.equals(input.toString()))
      System.out.println("They are anagrams");
    else
      System.out.println("They aren't anagrams");


  }
}
