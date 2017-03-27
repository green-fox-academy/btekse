import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Balázs on 2017. 03. 27..
 */
// Create a method that decrypts the assets/duplicated_chars.txt
public class Doubled {

  public static void main(String[] args) {

    List<String> lines = new ArrayList<>();
    List<String> nonDoubled = new ArrayList<>();

    try {
      Path filepath = Paths.get("duplicated-chars.txt");
      lines = Files.readAllLines(filepath);
      System.out.println("File reading OK.");
    } catch (IOException e) {
      System.out.println("Ooops. Something wrong:" + e.getClass());
    }

    for (String oneline : lines) {
      StringBuilder myStringBuilder = new StringBuilder();
      if (oneline.length() != 0) {
        myStringBuilder.append(oneline.charAt(0));
      }
      for (int i = 1; i < oneline.length(); i++) {
        if (oneline.charAt(i) != oneline.charAt(i - 1)) {
          myStringBuilder.append(oneline.charAt(i));
        }
      }
      System.out.println(myStringBuilder.toString());
    }
  }
}