import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter girls number: ");
    int girlsNumber = scanner.nextInt();

    System.out.println("Enter boys number: ");
    int boysNumber = scanner.nextInt();

    if (girlsNumber == boysNumber && girlsNumber + boysNumber > 20) {
      System.out.println("The party is excellent!");
    } else if (girlsNumber + boysNumber < 20 && girlsNumber == 0) {
      System.out.println("Sausage party");
    } else if (girlsNumber + boysNumber > 20 && girlsNumber != boysNumber) {
      System.out.println("Quite cool party!");
    } else if (girlsNumber + boysNumber < 20) {
      System.out.println("Average party...");
    }
  }
}
