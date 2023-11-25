import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml"); 
	
		/**
		 * Object obj;
		 * if(scope == prototype){
		 * 		obj = new EMployee();
		 * }else if(scope == singleton){
		 * 	if(obj ==null){
		 * 		obj = new EMployee();
		 * }
		 * }
		 */
		Employee e = (Employee) context.getBean("employee");
		e.setEmail("abc@example.com");
		System.out.println(e);
		
		Employee e1 = (Employee) context.getBean("employee");
		System.out.println(e1);
		
		Address add= (Address) context.getBean("address");
		System.out.println(add);
		
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		
	}

}
