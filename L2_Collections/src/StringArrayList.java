import java.util.ArrayList;

public class StringArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList= new ArrayList<Student>();
		
		Student stu;
		for(int i=0;i<100;i++) {
			stu = new Student(i+1, "Name"+i, "Phone "+i);
			System.out.println(stu.hashCode());
			studentList.add(stu);
		}
		
		
		/*for (Student student : studentList) {
			System.out.println(student);
		}*/
	}
}
