/**
 * Created by Balázs on 2017. 03. 21..
 */
public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52

  int daily = 6;
  int weeks = 17;
  int weekly = 52;

  double a = 30.0/52.0;
  double b = a * 100;

  System.out.println ("You coding: " + (daily * weeks) + " hours during the academy.");
  System.out.println ("It means that you'll coding the " + ((52.0 / 168) *  100) + "% of your time during Green Fox.");
  }
}