/**
 * Created by Balázs on 2017. 03. 27..
 */

// - Create an array variable named `q`
//   with the following content: `[4, 5, 6, 7]`
// - Print the third element of `q`

public class Third {
  public static void main(String[] args) {
    int[] q = {4, 5, 6, 7};

    // Print the second element of the array
    System.out.println("The third element is " + q[3]);

    // Print all the array elements
    for (int i = 0; i < q.length; i++) {
      System.out.println(q[i] + " ");
    }
  }
}
