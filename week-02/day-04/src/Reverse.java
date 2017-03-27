/**
 * Created by Balázs on 2017. 03. 23..
 */
public class Reverse {
  public static void main(String[] args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";


    StringBuilder input = new StringBuilder();
    input.append(reversed);
    input = input.reverse();

    for (int i = 0; i < input.length(); i++)

      System.out.print(input.charAt(i));
  }
}

array[][]
