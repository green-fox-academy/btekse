/**
 * Created by Balázs on 2017. 04. 03..
 */
public class Animal {
  int hunger;
  int thirst;


  public Animal() {
    hunger = 50;
    thirst = 50;
  }

  public void Eat() {
    this.hunger -= 1;
  }

  public void Drink() {
    this.thirst -= 1;
  }

  public void Play() {
    this.hunger += 1;
    this.thirst += 1;
  }
}

