package Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "firstname")
  private String firstName;

  @Column(name = "lastname")
  private String lastName;

  @Column(name = "patronymic")
  private String patronymic;

  @Column(name = "age")
  private int age;

  public StudentAddress getAddr() {
    return addr;
  }

  public void setAddr(StudentAddress addr) {
    this.addr = addr;
  }

  @Embedded
  private StudentAddress addr;


  @OneToMany(fetch = FetchType.EAGER, mappedBy = "stud")
  private Set<Exam> exams_set;

  public Set<Exam> getExams_set() {
    return exams_set;
  }

  public void setExams_set(Set<Exam> exams_set) {
    this.exams_set = exams_set;
  }

  @Override
  public String toString() {
    return "StudentEnt{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", patronymic='" + patronymic + '\'' +
        ", age=" + age +
        '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
