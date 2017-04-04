import java.util.ArrayList;
import java.util.List;

/**
 * Created by Balázs on 2017. 04. 04..
 */
public class LagopusClass {
  private String className;
  private List<Student> students;
  private List<Mentor> mentors;

  public LagopusClass(String className) {
    this.className = className;
    students = new ArrayList<>();
    mentors = new ArrayList<>();
  }

  public void addStudent(Student studentToAdd) {
    this.students.add(studentToAdd);
  }

  public void addMentor(Mentor mentorToAdd) {
    this.mentors.add(mentorToAdd);
  }

  public void info() {
    System.out.println("Lagopus" + className + " class has" + students.size + " students and" + mentors.size + " mentors.");
  }
}