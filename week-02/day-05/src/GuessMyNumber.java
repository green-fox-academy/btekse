/**
 * Created by Balázs on 2017. 03. 23..
 */

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);

  boolean game = true;
  while(game)
    { // addig fut, ameddig ez true


      System.out.println("Enter the maximum range:");
      int rng = myScanner.nextInt();

      System.out.println("Enter the number of lives:");
      int ln = myScanner.nextInt();

      Random rand = new Random();
      int rn = rand.nextInt(rng) + 1;
      // System.out.println(rn); // to be removed later

      boolean foundNumber = false;
      for (int l = ln; l > 0 && !foundNumber; l--) {
        //System.out.println("Count is: " + l); // to be removed later

        System.out.println("I've got a number between 1-" + rng + ". " +
          "You have " + l + " lives. Enter number: ");
        int n1 = myScanner.nextInt();

        if (n1 == rn) {
          System.out.println("Congratulations. My number was: " + rn + "." +
            " You won!");
          foundNumber = true;
        } else if (n1 > rn)
          System.out.println("Too high.");
        else
          System.out.println("Too low.");
      }



      boolean iscorrectanswer = false;
      while (!iscorrectanswer) {
        System.out.println("New game (y/n)?");
        String newgame = myScanner.next();
        if ("y".equals(newgame)) {
          iscorrectanswer = true;
        } else if ("n".equals(newgame)) {
          game = false;
          iscorrectanswer = true;
          }
          else
          System.out.println("Bad answer: "+newgame+" Try another.");
      }

    }
    System.out.println("Thanks for playing");
  }
}
