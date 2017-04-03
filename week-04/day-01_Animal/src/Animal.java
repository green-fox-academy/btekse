/**
 * Created by Balázs on 2017. 04. 03..
 */
public class Animal {
  String name;
  int hunger;
  int thirst;
  int eat;
  int drink;
  int play;

  public Animal() {
    hunger = 50;
    thirst = 50;
  }

  public void Eat() {
    hunger -= 1;
  }

  public void Drink() {
    thirst -= -1;
  }

  public void Play() {
    hunger += 1;
    thirst += 1;
  }

  public void print(){
    System.out.println("Hunger: " + hunger);
    System.out.println("Thirst: " + thirst);
  }

}

