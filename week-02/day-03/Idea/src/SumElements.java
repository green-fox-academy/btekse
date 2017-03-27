import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Balázs on 2017. 03. 28..
 */

// - Create an array variable named `r`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element

public class SumElements {
  public static void main(String[] args) {
    int[] r = {54, 23, 66, 12};

    System.out.println((r[1] + r[2]));
  }
}
