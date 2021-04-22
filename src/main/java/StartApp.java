import Entity.Exam;
import Entity.Student;
import Entity.StudentAddress;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

//import java.lang.module.Configuration;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import reports.ExamResult;
import reports.Reports;

import java.util.List;
import java.util.Set;

public class StartApp {
  public static void main(String[] args) {
    SessionFactory sfact = new Configuration().configure().buildSessionFactory();
    Session sess = sfact.openSession();


    Transaction trans = sess.beginTransaction();

    /*StudentEnt se = new StudentEnt();
    se.setFirstName("Igoryasha");
    se.setLastName("Grigorev");
    se.setPatronymic("Vladimirovich");
    se.setAge(10);

    studentAddress sa = new studentAddress();
    sa.setAddress("Бирюлёвская улица");
    sa.setCity("Москва");
    sa.setCountry("Россия");

    se.setAddr(sa);


    sess.save(se);
*/

    /*StudentEnt se = sess.load(StudentEnt.class, 5);
    System.out.println(se);
    Set<Exam> exams_set = se.getExams_set();

    System.out.println(exams_set);*/


//    StudentEnt se1 = sess.get(StudentEnt.class, 3);
//    System.out.println(se1);

/*
    Query q = sess.createQuery("from StudentEnt");
    List<StudentEnt> lst = q.getResultList();
*/

    Reports r = new Reports();
/*
    List<ExamResult> examResults = r.getExamResults("Igoryasha", "Grigorev", sess);
*/
    List<ExamResult> examResults = r.getExamResults1("Igoryasha", "Grigorev", sess);


    trans.commit();




    sess.close();
    sfact.close();
  }
}