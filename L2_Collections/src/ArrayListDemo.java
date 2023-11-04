import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Size of al: "+al.size());
		
		al.add(100);
		al.add(100);
		al.add(101);
		al.add(102);
		al.add(103);
		al.add(104);
		al.add(105);
		
		System.out.println("Size of al: "+al.size());
		
		for (Integer integer : al) {
			System.out.println(integer);
		}
		
		al.add(3, 200);
		
		System.out.println("Size of al: "+al.size());
		
		for (Integer integer : al) {
			System.out.println(integer);
		}
		
		//Collections.sort(al);
		
		List<Integer> list = new ArrayList<Integer>(al);
		
		System.out.println("Size of LIST: "+list.size());
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		ArrayList<String> alStr= new ArrayList<String>();
		alStr.add("Aditya");
		alStr.add("John");
		alStr.add("David");
		
		for(int i=0;i<alStr.size();i++) {
			System.out.println(alStr.get(i));
		}
		
		Object[] arr = alStr.toArray();
		
		
		
		
		
	}

}
