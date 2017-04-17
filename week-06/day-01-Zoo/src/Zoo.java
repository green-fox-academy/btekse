import main.java.animals.*;

public class Zoo {

  public static void main(String[] args) {

    Reptile reptile = new Reptile("Crocodile", 5, female, 4, 70);
    Mammal mammal = new Mammal("Koala", 2, male, 4, 3);
    Bird bird = new Bird("Parrot", 4, female, 2, 1);

    System.out.println("Who want a baby?");
    System.out.println(reptile.getName() + ", " + reptile.wantChild());
    System.out.println(mammal.getName() + ", " + mammal.wantChild());
    System.out.println(bird.getName() + ", " + bird.wantChild());
  }
}