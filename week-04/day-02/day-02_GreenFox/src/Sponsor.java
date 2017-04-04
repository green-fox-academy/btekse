/**
 * Created by Balázs on 2017. 04. 04..
 */
public class Sponsor extends Person {
  private String company; //field
  private int hiredStudents; //field

  @Override //method
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender() +
      " who represents " + company + " and hired" + hiredStudents + " students so far.");
  }
  public void hire() {
    this.hiredStudents += 1;
  }

  @Override //method
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }
}
