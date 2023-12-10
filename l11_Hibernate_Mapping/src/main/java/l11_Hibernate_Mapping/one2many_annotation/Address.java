package l11_Hibernate_Mapping.one2many_annotation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="o2mA-address")
public class Address {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "street")
	private String street;
	@Column(name = "state")
	private String state;
	@Column(name = "country")
	private String country;
	
	@ManyToOne
	@JoinColumn(name="emp_id", nullable = false)
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
