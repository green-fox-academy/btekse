/**
 * Created by Balázs on 2017. 03. 23..
 */
import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem{
  public static void main(String[] args){
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
    // Lists#1
    // Saturn is missing from the planetList
    // Insert it into the correct position
    planetList.add(5, "Saturn");
    System.out.println(planetList);
  }
}
