package l11_Hibernate_Mapping.many2many;

import java.util.Set;

public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private Set<Course> courses;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
