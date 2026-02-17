package thread;

public class Main {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
//	operazioni multi thread (vengono eseguiti in parallelo)
		Counter c1 = new Counter("culo", 63);
		c1.start();
		
		Counter c2 = new Counter("ano", 63);
		c2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		CountDown c3 = new CountDown(30, "palle");
		Thread t = new Thread(c3, c3.getNome());
		t.start();
		
		
		System.out.println("Fine del lavoro del main");
	}
}
