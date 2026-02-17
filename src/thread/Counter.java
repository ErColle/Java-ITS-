package thread;

public class Counter extends Thread {
	
	private int max;

	public Counter(String nome, int max) {
		super(nome);
		this.max = max;
	}

	@Override
	public void run() {
		for (int i = 1; i <=max; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println( Thread.currentThread() + " " +  i);
		}
	} 
}
