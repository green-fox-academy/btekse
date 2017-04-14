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

  int dailyCodingHours = 6;
  int semesterWeeks = 17;
  int workDays = 5;
  double averageWorkHoursWeekly = 52.;
  double hoursInWeek = (24*7.);

  double a = 30.0/52.0;

  System.out.println ("You coding: " + (dailyCodingHours * workDays * semesterWeeks) + " hours during the academy.");
  System.out.println ("It means that you'll coding the " + (averageWorkHoursWeekly / hoursInWeek) * 100 + "% of your time during Green Fox.");
  }
}