
public class PrintTable extends Thread {

	int num;

	public PrintTable(int num) {
		super();
		this.num = num;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		synchronized (this) {
			for(int i=1;i<11;i++) {
				System.out.println(num+" X "+i+" = "+num*i+this.getName());	
			}
		}
		
	}
}
