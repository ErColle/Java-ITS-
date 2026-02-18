package Esercizi.corridoriThread;
import java.util.Random;

public class Corridore implements Runnable{
	
	private String nome;
	private Random random = new Random();
	private static int posizione = 0;
	private static String vincitore;
	
	public String getVincitore() {
		return vincitore;
	}
	
	public Corridore(String nome) {
		super();
		this.nome = nome;
	}
	


	public String getNome() {
		return nome;
	}

	public static int getPosizione() {
		return posizione;
	}

	@Override
	synchronized public void run() {
		for(int i = 1; i < 5; i++) {
			System.out.println(nome + " ha completato la tappa " + i);
			try {
				Thread.sleep((int) random.nextInt(200, 801));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (posizione == 0) {
			vincitore = nome;
		}
		posizione++;
		

		System.out.println(nome + " e' arrivato in posizione " + posizione );
	}
	
	

}
