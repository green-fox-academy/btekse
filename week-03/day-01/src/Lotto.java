import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Balázs on 2017. 03. 27..
 */
public class Lotto {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lotto numbers assets/lotto.csv
    List<String> lines = new ArrayList<>();
    try {
      Path filepath = Paths.get("lotto.csv");
       lines = Files.readAllLines(filepath);
      System.out.println("File reading OK.");


    } catch (IOException e) {
      System.out.println("Ooops. Something wrong:" + e.getClass());
    }
  for (String oneline : lines) {
    String[] splitlines = oneline.split(";");
    //System.out.println(splitlines[11]);
  }
  // string tömb elkészült, tesztelve



  }
}
