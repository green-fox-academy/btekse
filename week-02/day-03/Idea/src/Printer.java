import java.util.Scanner;

/**
 * Created by Balázs on 2017. 03. 23..
 */
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...
public class Printer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter something: ");
    String[] strings = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};
    printer(strings);
  }

  public static void printer (String... strArr) {
    for (int i = 0; i < strArr.length; i++) {
      System.out.println((i + 1) + ". " + strArr[i]);
    }
  }
}