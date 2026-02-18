package Esercizi.labancaThread;

public class ThreadConto extends Thread{

    private Banca banca;
    private int nome;

    public ThreadConto(Banca banca, int nome){
        this.banca = banca;
        this.nome = nome;
    }

    @Override
    public void run(){
        while(true){
            int rand = (int)(Math.random()*10 + 1);
            try {
                banca.bonifico(nome, rand, 500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
