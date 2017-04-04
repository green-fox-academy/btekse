/**
 * Created by Balázs on 2017. 04. 04..
 */
public class Person {
  private String name;
  private int age;
  private String gender;

  public String getName() {
    return this.name;
  }

  public String getAge() {
    return this.age;
  }

  public String getGender() {
    return this.gender;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
  }

  public void getGoal() {
    System.out.println("My goal is live for the moment.");
  }

  Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }


}
