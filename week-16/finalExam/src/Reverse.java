import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter text: ");
    String inputString = myScanner.next();
    System.out.println(stringReverser(inputString));
  }

  public static String stringReverser (String inputString) {
    char[] inputStringArray = inputString.toCharArray();
    String reverseString = "";
    for (int i = inputStringArray.length - 1; i >= 0; i--) {
      reverseString += inputStringArray[i];
    }
    return reverseString;
  }
}
