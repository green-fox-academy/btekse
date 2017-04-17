public class Mammal extends Animal {

  public Mammal(String name, int age, String gender, int legsNumber, int weightInKg) {
    super(name, age, gender, legsNumber, weightInKg)
  }

  String wantChild() {
    return "want child of course...";
  }

  @Override
  public void eat() {
    System.out.println("eating...");
  }
}
