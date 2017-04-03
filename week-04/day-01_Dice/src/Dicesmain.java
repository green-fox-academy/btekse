/**
 * Created by Balázs on 2017. 04. 03..
 */
public class Dicesmain {

  public static void main(String[] args) {
    Dice myDice = new Dice();
    myDice.getCurrent();
    myDice.roll();

    //In exercise
    myDice.getCurrent();
    myDice.getCurrent(5);
    myDice.reroll();
    myDice.getCurrent();
    myDice.reroll(4);
    myDice.getCurrent();

    for (int rolled : myDice.getCurrent()) {
      System.out.println(rolled);

  // Additional solution
    /*int fullsix = 0;

    while(fullsix != 6 * myDice.getCurrent().length) {
      fullsix = 0;
      for (int i = 0; i < myDice.getCurrent().length; i++) {
        fullsix += myDice.getCurrent(i);
        if(myDice.getCurrent(i) != 6) {
          myDice.reroll(i);
        }
      }
    }
*/

    }
  }
}


