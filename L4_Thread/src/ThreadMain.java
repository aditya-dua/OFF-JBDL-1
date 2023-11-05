
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintNumbers pn = new PrintNumbers();
		pn.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main: "+i);
			
		}
	}

}
