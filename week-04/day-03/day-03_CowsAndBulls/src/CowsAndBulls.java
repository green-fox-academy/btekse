import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CowsAndBulls {
  private int level;
  List<Integer> randomNuber;

  public CowsAndBulls(int level) {
    this.level = level;
    this.randomNuber = new ArrayList<>();
    for (int i = 0; i < level; i++) {
      int randomN = (int) (Math.random() * 10);
      randomNuber.add(randomN);
    }
  }

  public CowsAndBulls() {
    this.randomNuber = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int userInput = scanner.nextInt();
  }
}
