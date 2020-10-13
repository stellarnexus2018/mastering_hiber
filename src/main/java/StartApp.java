import Entities.StudentEnt;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

//import java.lang.module.Configuration;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StartApp {
  public static void main(String[] args) {
    SessionFactory sfact = new Configuration().configure().buildSessionFactory();
    Session sess = sfact.openSession();


    Transaction trans = sess.beginTransaction();

    StudentEnt se = new StudentEnt();
    se.setFirstName("Igoryasha");
    se.setLastName("Grigorev");
    se.setPatronymic("Vladimirovich");
    se.setAge(47);

    sess.save(se);

    trans.commit();




    sess.close();
    sfact.close();
  }
}