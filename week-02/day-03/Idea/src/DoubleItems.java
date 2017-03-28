import java.util.Arrays;

/**
 * Created by Balázs on 2017. 03. 28..
 */
// - Create an array variable named `ag`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

public class DoubleItems {
  public static void main(String[] args) {
    int[] ag = {3, 4, 5, 6, 7};
    for (int a = 0; a < ag.length; a++) {
      ag[a]=ag[a] * 2;
    }
    System.out.println(Arrays.toString(ag));
  }
}
