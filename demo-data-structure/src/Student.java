import java.util.ArrayList;
import javax.security.auth.Subject;

public class Student {
  private String name;
  private ArrayList<Subject> subjects;

  public Student(String name, ArrayList<Subject> subjects) {
    this.name = name;
    this.subjects = subjects;
  }

  public Student(String name) {
    this.name = name;
    this.subjects = new ArrayList<>();
    // Encapsulate Data Structure. No impact to user if I change array.
  }

  // equals(), hashCode() ...

  @Override
  public String toString() {
    return "Student(" //
        + "name=" + this.name //
        + ", subjects=" + this.subjects //
        + ")";
  }

  public ArrayList<Subject> getSubjects() {
    return this.subjects;
  }

  public boolean add(Subject subject) {
    return this.subjects.add(subject);
  }

  public boolean remove(Subject subject) {
    return this.subjects.remove(subject);
  }

  public Subject remove(int index){
    return this.subjects.remove(index);
  }

  public static void main(String[] args) {
    // Revise the design so that we can add extra subject to an existing student
Student kenny = new Student("Kenny");
kenny.add(new Subject(90, "English"));
kenny.add(new Subject(100, "Maths"));


  } // end of main()



}
