import org.springframework.context.annotation.Bean;

public class Employee {

	private String name;
	private int id;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(String name, int id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		System.out.println("Employee display called.");
	}
	
	
}
