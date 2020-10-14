package reports;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class Reports {

  public List<ExamResult> getExamResults(String _firstName, String _lastName, Session sess) {

    String query = "select new reports.ExamResult(s.lastName, sj.name, e.grade) " +
        "from Exam e, StudentEnt s, Subject sj " +
        "where e.stud.id = s.id and e.subj.id = sj.id " +
        "and s.firstName = :firstName and s.lastName = :lastName";


    Query hibq = sess.createQuery(query);

    hibq.setParameter("firstName", _firstName);
    hibq.setParameter("lastName", _lastName);


    List<ExamResult> res = hibq.getResultList();
    return res;
  }

  public List<ExamResult> getExamResults1(String _firstName, String _lastName, Session sess) {
    String query = "select new reports.ExamResult(e.stud.lastName, e.subj.name, e.grade) " +
        "from Exam e " +
        "where e.stud.firstName = :firstName and e.stud.lastName = :lastName";
    Query hibq = sess.createQuery(query);
    hibq.setParameter("firstName", _firstName);
    hibq.setParameter("lastName", _lastName);
    return hibq.getResultList();
  }







}
