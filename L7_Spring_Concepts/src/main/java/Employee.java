import org.springframework.context.annotation.Bean;

public class Employee {

	private String name;
	private int id;
	private String email;
	private Address address;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Name Setter called");
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
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(String name, int id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		System.out.println("Constructor Param employee called");
	}
	
	public Employee(Address address) {
		super();
		this.address = address;
	}
	
	public Employee() {
		super();
		System.out.println("Constructor Default employee called");
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		System.out.println("Employee display called.");
	}
	
	
}
