/**
 * Created by Balázs on 2017. 03. 21..
 */
public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int remainingSeconds = ((60 * 60 * 24) - (currentSeconds + (currentMinutes * 60) + (3600 * currentHours)));
    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented bt the variables

    System.out.println("Remaining seconds: " + (remainingSeconds));
  }
}