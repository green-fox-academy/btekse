/**
 * Created by Balázs on 2017. 03. 21..
 */
import java.util.Scanner;
public class HelloUser {
  public static void main(String[] args)
  {
    // Modify this program to greet user instead of the World!
    // The program should ask for the name of the user
    System.out.println("What is your name?");
    Scanner myScanner = new Scanner(System.in);
    String name = myScanner.nextLine();
    System.out.println("Hello, " + name + "!");
  }
}
