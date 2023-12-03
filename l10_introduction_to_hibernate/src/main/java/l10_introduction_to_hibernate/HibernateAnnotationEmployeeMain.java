package l10_introduction_to_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateAnnotationEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config= new Configuration();
		
		SessionFactory sf = config.configure("hbm-annotation.cfg.xml").buildSessionFactory();
		
		System.out.println("Session Factory::"+sf);
	
		EmployeeAnnotation emp = new EmployeeAnnotation(1, "Aditya", 1000);
		
		Session session = sf.openSession();
		
		session.save(emp);
		session.close();
	
	}

}
