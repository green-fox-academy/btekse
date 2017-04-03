/**
 * Created by Balázs on 2017. 03. 30..
 */


public class String1 {
  public static void main(String[] args) {
    String s = "hello world";
    System.out.println(xchange(s));
  }

  public static String xchange(String s) {
    char x = 'h';
    char y = 'y';
    if (s.length() < 1) {
        return s;
    } else {
      if (x == s.charAt(0)) {
        return y + xchange(s.substring(1));
      } else {
        return s.charAt(0) + xchange(s.substring(1));
      }
    }
  }
}
