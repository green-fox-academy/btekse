import java.util.ArrayList;
import java.util.List;

public class Sum {
  List<Integer> integersList = new ArrayList<>();

  public Sum(List<Integer> integersList) {
    if (integersList != null) {
      this.integersList = integersList;
    }
  }

  public int addNumbers() {
    int sum = 0;
    for (int i : integersList) {
      sum += i;
    }
    return sum;
  }
}
