package l11_Hibernate_Mapping.many2many;

import java.util.Set;

public class Course {
	
	private int id;
	private String name;
	private String desc;
	private Set<Teacher> teacher;
	public Course(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Set<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(Set<Teacher> teacher) {
		this.teacher = teacher;
	}
	
	

}
