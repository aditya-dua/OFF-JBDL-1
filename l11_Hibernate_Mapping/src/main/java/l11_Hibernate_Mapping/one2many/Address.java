package l11_Hibernate_Mapping.one2many;

public class Address {
	
	private int id;
	private String street;
	private String state;
	private String country;
	private Employee emp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Address(String street, String state, String country) {
		super();
		this.street = street;
		this.state = state;
		this.country = country;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
