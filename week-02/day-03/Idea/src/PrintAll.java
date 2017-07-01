import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Balázs on 2017. 03. 28..
 */
// - Create an array variable named `af`
//   with the following content: `[4, 5, 6, 7]`
// - Print all the elements of `af`
public class PrintAll {
  public static void main(String[] args) {
    int[] af = {4, 5, 6, 7};
    int sum = IntStream.of(af).sum();
    System.out.println(Arrays.toString(af));
    System.out.println("Sum of the arraay: " + sum);;
  }
}
