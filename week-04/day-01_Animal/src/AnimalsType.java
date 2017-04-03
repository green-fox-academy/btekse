/**
 * Created by Balázs on 2017. 04. 03..
 */
public class AnimalsType {
  public static void main(String[] args) {
    Animal fox = new Animal();
    //Animal dog = new Animal();

    fox.drink();
    fox.print();
    fox.eat();
    fox.print();
    fox.play();
    fox.print();

    System.out.println(fox.hunger);
    System.out.println(fox.thirst);
  }
}
