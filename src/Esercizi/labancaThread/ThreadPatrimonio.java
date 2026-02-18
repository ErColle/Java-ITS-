package Esercizi.labancaThread;

public class ThreadPatrimonio extends Thread {

    private Banca banca;
    private double patrimonio;

    public ThreadPatrimonio(Banca banca){
        this.banca = banca;
    }

    public double getPatrimonio(){
        for(double s : banca.conti.values()){
            patrimonio += s;
            System.out.println(patrimonio);
        }
        return patrimonio;
    }

}
