
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PrintNumbers pn = new PrintNumbers();
		//pn.start();
		
		PrintNumberRunnable p = new PrintNumberRunnable();
		Thread t = new Thread(p);
		t.setDaemon(true);
		System.out.println("Daemon Prio:"+t.getPriority());
		t.start();
		System.out.println(t.getState());
		Thread t1 = new Thread(p);
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main: "+i);
		}
		
		System.out.println(t.getState());
		
		
	}

}
