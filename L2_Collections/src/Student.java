
// https://www.youtube.com/watch?v=QEc6kSQ1keg
public class Student {
	
	int id;
	String name;
	String phone;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	

}
