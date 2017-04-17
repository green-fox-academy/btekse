public abstract class Animal {

  String name;
  int age;
  String gender;
  int legsNumber;
  int weightInKg;

  public Animal(String name, int age, String gender, int legsNumber, int weightInKg){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.legsNumber = legsNumber;
    this.weightInKg = weightInKg;
  }

  void greet() {
    System.out.println("Hi...");
  }

  public abstract String wantChild();

  void eat() {
    System.out.println("eating...");
  }
}
