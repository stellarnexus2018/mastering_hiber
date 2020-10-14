package Entities;

import javax.persistence.*;

@Entity
@Table(name="exams")
public class Exam {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "grade")
  private int grade;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "stud")
  private StudentEnt stud;


  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "subj")
  private Subject subj;

  @Override
  public String toString() {
    return "Exam{" +
        "id=" + id +
        ", grade=" + grade +
        ", stud=" + stud +
        ", subj=" + subj +
        '}';
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public StudentEnt getStud() {
    return stud;
  }

  public void setStud(StudentEnt stud) {
    this.stud = stud;
  }

  public Subject getSubj() {
    return subj;
  }

  public void setSubj(Subject subj) {
    this.subj = subj;
  }
}
