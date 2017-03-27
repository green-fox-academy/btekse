/**
 * Created by Balázs on 2017. 03. 27..
 */
public class running {
  public static void main(String[] args) {
    int a = 5;
    int b = 1;
    try {
      System.out.println(a / b);
      System.out.println("It works");
    } catch (ArithmeticException e) {
      System.out.println("It doesn't work" + e);
    }

    System.out.println("Hi");
  }
}
