package l11_Hibernate_Mapping.many2many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Many2ManyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Course add1 = new Course("Course 1", "Course 1 Desc"); 
		  Course add2 = new Course("Course 2", "Course 2 desc"); 
		  
		  Set<Course> addSet = new HashSet<Course>();
		  
		  addSet.add(add2); addSet.add(add1);
		  
		  
		  Teacher emp1 = new Teacher();
		  Teacher emp2 = new Teacher();
		  
		  emp1.setName("ABc");
		  emp1.setSalary(1000);
		  
		  emp2.setName("DEF");
		  emp2.setSalary(2000);
		  
		  Set<Teacher> teacherSet = new HashSet<Teacher>();
		  
		 
		  teacherSet.add(emp2);
		  teacherSet.add(emp1);
		  
		  emp1.setCourses(addSet);
		  
		  add1.setTeacher(teacherSet);
		 
		 
		
		
		
		Configuration config= new Configuration();
		
		SessionFactory sf = config.configure("hbm.cfg.xml").buildSessionFactory();
		
		System.out.println("Session Factory::"+sf);
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(add1);
		session.save(add2);
		session.save(emp1);
		session.save(emp2);
		
		session.flush();
		tx.commit();
		
		
		session.close();
	}

}
