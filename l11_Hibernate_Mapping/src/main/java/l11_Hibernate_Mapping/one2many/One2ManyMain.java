package l11_Hibernate_Mapping.one2many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class One2ManyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add1 = new Address("Delhi", "Delhi", "Delhi");
		Address add2 = new Address("Gurugram", "Gurugram", "Gurugram");
		Set<Address> addSet = new HashSet<Address>();
		
		addSet.add(add2);
		addSet.add(add1);
		
		
		Employee emp = new Employee(0, "Aditya", 1000);
		add2.setEmp(emp);
		add1.setEmp(emp);
		emp.setAddress(addSet);
		
		
		
		Configuration config= new Configuration();
		
		SessionFactory sf = config.configure("hbm-o2m.cfg.xml").buildSessionFactory();
		
		System.out.println("Session Factory::"+sf);
		
		Session session = sf.openSession();
		
		//session.save(add);
		session.save(emp);
		session.save(add1);
		session.save(add2);
		
		session.close();
	}

}
