
public class PrintTableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintTable pt = new PrintTable(4);
		pt.start();
		pt.setPriority(Thread.MIN_PRIORITY);
		pt.setName("Table of 4");
		
		PrintTable pt1 = new PrintTable(5);
		pt1.start();
		pt1.setName("Table of 5");
		
		//pt1.run();
	}

}
