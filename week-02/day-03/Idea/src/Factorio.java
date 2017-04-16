import java.util.Scanner;

//  #5
//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

public class Factorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your number to factorial: ");
    int numToFactorial = scanner.nextInt();
    System.out.println("The factorial of " + numToFactorial + " is: " + sum(numToFactorial));
  }

  public static int sum(int input) {

    int summary = 1;
    for (int i = 1; i <= input; i++) {
      summary *= i;
    }
    return summary;
  }
}
