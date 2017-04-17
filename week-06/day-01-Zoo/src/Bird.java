public class Bird extends Animal {
  public Bird (String name, int age, String gender, int legsNumber, int weightInKg) {
    super(name, age, gender, legsNumber, weightInKg);
  }

  @Override
  public String wantChild() {
    return "want child from an egg";
  }

  @Override
  public void move() {
    System.out.println("with wings");
  }
}
