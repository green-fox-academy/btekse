/**
 * Created by Balázs on 2017. 04. 04..
 */
public class Mentor extends Person {
  private String level; //field

  @Override //method
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override //method
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() +
      " " + level + " mentor.");
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    super();
    this.level ="intermediate";
  }
}