/**
 * Created by Balázs on 2017. 04. 03..
 */
public class AnimalsType {
  public static void main(String[] args) {
    Animal fox = new Animal();

    System.out.println("hunger #1: " + fox.hunger);
    System.out.println("thirst #1: " + fox.thirst);

    fox.Eat();
    fox.Drink();

    System.out.println("hunger #2: " + fox.hunger);
    System.out.println("thirst #2: " + fox.thirst);

    fox.Play();

    System.out.println("hunger #2: " + fox.hunger);
    System.out.println("thirst #2: " + fox.thirst);

  }


}
