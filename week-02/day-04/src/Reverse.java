/**
 * Created by Balázs on 2017. 03. 23..
 */
public class Reverse {
  public static void main(String[] args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a function that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!
    // Try to solve this using charAt() first, and optionally anything else after.
    StringBuilder input = new StringBuilder();
    input.append(reversed);
    input = input.reverse();

    for (int i = 0; i < input.length(); i++)

      System.out.print(input.charAt(i));
  }
}


