/**
 * Created by Balázs on 2017. 04. 06..
 */


// - Create an array variable named `nimals`
//   with the following content: `["kuty", "macs", "cic"]`
// - Add all elements an `"a"` at the end

public class AppendA2 {
  public static void main(String[] args) {
    String[] nimals = {"kuty", "macs", "cic"};

    for (int i = 0; i < nimals.length; i++) {
      nimals[i] += "a";
      System.out.println(nimals[i]);
    }
  }
}
