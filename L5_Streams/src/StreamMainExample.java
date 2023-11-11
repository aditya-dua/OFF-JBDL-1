import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numList = Arrays.asList(1,2,3,4);
		
		
		List<Integer> squareList = numList.stream()
				.map(x->x*x)
				.map(x-> x%5)
				.collect(Collectors.toList());
		
		
		
		
		for (int i = 0; i < squareList.size(); i++) {
			System.out.println("Number:"+numList.get(i)+" Square:"+squareList.get(i));	
		}
		
		List<Integer> marksList = Arrays.asList(50,75,20,80);
		List<Integer> passMarks = marksList.stream()
				.filter(x->x%10==0)
				.map(x->x*x)
				.map(x-> x%5)
				.sorted()
				.collect(Collectors.toList());
		
		for (int i = 0; i < passMarks.size(); i++) {
			System.out.println("Number:"+numList.get(i)+" Square:"+squareList.get(i));	
		}
		
		/*
		 * 1,2,3,4
		 * Sum
		 * 0
		 * 0+1 =1,
		 * 1+2=3...
		 */
		int sum = numList.stream().reduce(0,(total,x)->total+x);
		
		System.out.println(sum);
		//marksList.parallelStream().
	
	}

}
