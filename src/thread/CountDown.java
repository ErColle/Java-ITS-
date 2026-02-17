package thread;

public class CountDown implements Runnable {
	
	private int max;
	private String nome;
	
	
		public CountDown(int max, String nome) {
		super();
		this.max = max;
		this.nome = nome;
	}

	@Override
	public void run() {
		for(int i = max; i >=1 ; i--) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}
	
	public String getNome() {
		return nome;
	}
}
