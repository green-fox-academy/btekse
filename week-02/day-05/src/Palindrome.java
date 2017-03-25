/**
 * Created by Balázs on 2017. 03. 24..
 */
import java.util.Scanner;


public class Palindrome {


  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter the word: ");
    int reversed = myScanner.nextInt();

    //String reversed = w;

    StringBuilder input = new StringBuilder();
    input.append(reversed);
    input = input.reverse();

    for (int i = 0; i < input.length(); i++)

      System.out.print(input.charAt(i));
  }
}


