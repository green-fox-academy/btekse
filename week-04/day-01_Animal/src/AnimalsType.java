public class AnimalsType {
  public static void main(String[] args) {
    Animal fox = new Animal();

    System.out.println("hunger#1: " + fox.hunger);
    System.out.println("hunger#1: " + fox.thirst);

    fox.Eat();
    fox.Drink();

    System.out.println("hunger#2: " + fox.hunger);
    System.out.println("hunger#2: " + fox.thirst);

    fox.Play();

    System.out.println("hunger#3: " + fox.hunger);
    System.out.println("hunger#3: " + fox.thirst);
  }
}
