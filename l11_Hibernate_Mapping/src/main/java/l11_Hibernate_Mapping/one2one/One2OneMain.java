package l11_Hibernate_Mapping.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class One2OneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add = new Address("Delhi", "Delhi", "Delhi");
		
		Employee emp = new Employee(0, "Aditya", 1000);
		add.setEmp(emp);
		emp.setAddress(add);
		
		
		
		Configuration config= new Configuration();
		
		SessionFactory sf = config.configure("hbm.cfg.xml").buildSessionFactory();
		
		System.out.println("Session Factory::"+sf);
		
		Session session = sf.openSession();
		
		//session.save(add);
		session.save(emp);
		session.close();
	}

}
