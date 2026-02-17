package Esercizi.corridoriThread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Corridore c1 = new Corridore("Gianni"); 
		Thread t1 = new Thread(c1, c1.getNome());
		
		
		Corridore c2 = new Corridore ("Epstein");
		Thread t2 = new Thread(c2, c2.getNome());
		
		Corridore c3 = new Corridore("Freak");
		Thread t3 = new Thread(c3, c3.getNome());
		

		t3.start();
		/*
		 * try { t3.join(); // aspetta che t3 finisca } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */

		t1.start();
		t2.start();
		
		try { 
			t1.join();
			t2.join();
			t3.join();
			
		} catch (InterruptedException e ) {
			e.printStackTrace();
		}
	
		System.out.println("\n!!!!!! Il vincitore e' " + c1.getVincitore());
	}

}
