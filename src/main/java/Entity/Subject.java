package Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "subjects")
public class Subject {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "name")
  private String name;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "subj")
  private Set<Exam> subj_exams;

  public Set<Exam> getSubj_exams() {
    return subj_exams;
  }

  public void setSubj_exams(Set<Exam> subj_exams) {
    this.subj_exams = subj_exams;
  }

  @Override
  public String toString() {
    return "Subject{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}