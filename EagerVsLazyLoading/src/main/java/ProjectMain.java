

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config= new Configuration();
		
		SessionFactory sf = config.configure("hbm-annotation.cfg.xml").buildSessionFactory();
		
		System.out.println("Session Factory::"+sf);
	
		// Saving Lazy Data
		UserLazy user = new UserLazy();
		user.setUserId((long) 1);	
		
		OrderDetail od = new OrderDetail();
		od.setOrderId((long) 1);
		OrderDetail od2 = new OrderDetail();
		od2.setOrderId((long) 2);
		
		Set<OrderDetail> set = new HashSet<OrderDetail>();
		
		set.add(od);
		set.add(od2);
		user.setOrderDetail(set);
		
		
		// Saving Eager Data
		
		UserEager eager = new UserEager();
		eager.setUserId((long) 1);
		
		OrderDetailEager od3 = new OrderDetailEager();
		od3.setOrderId((long) 3);
		OrderDetailEager od4 = new OrderDetailEager();
		od4.setOrderId((long) 4);
		
		Set<OrderDetailEager> setEager = new HashSet<OrderDetailEager>();
		
		
		
		eager.setOrderDetail(setEager);
		
		od3.setUser(eager);
		od4.setUser(eager);
		
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
	
		
		session.save(user);
		session.save(od);
		session.save(od2);
		
		session.save(eager);
		session.save(od3);
		session.save(od4);
		
		session.flush();
		tx.commit();
		
		
		System.out.println("Calling Order Details ::: LAZY LOADING ::: START");
		Session session2 = sf.openSession(); 
		List<UserLazy> users = session2.createQuery("From UserLazy").list();
		UserLazy userLazyLoaded = users.get(0);
		
		
		System.out.println(userLazyLoaded.getOrderDetail());
		System.out.println("Calling Order Details ::: LAZY LOADING ::: END");
		
		System.out.println("Calling Order Details ::: EAGER LOADING ::: START");
		
		List<UserEager> list = session2.createQuery("From UserEager").list();
		System.out.println(list.get(0).getOrderDetail());
		
		System.out.println("Calling Order Details ::: EAGER LOADING ::: END");

		session.close();
	
	}

}
