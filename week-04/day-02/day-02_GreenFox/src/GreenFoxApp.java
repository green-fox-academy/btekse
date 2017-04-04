/**
 * Created by Balázs on 2017. 04. 04..
 */
public class GreenFoxApp {

  public static void main(String[] args) {

    Person myPerson = new Person();
    myPerson.introduce();

    Student myStudent = new Student();
    myStudent.introduce();
    myStudent.skipDays(5);

    //Person myPerson = new Student();
    Person StudentlikePerson = new Student();
    Student temp = (Student) StudentlikePerson;
    //System.out.println(temp.gets);
    //System.out.println(myPerson.introduce());
  }
}
