package Esercizi.labancaThread;

import java.util.HashMap;

public class Banca {
    HashMap<Integer, Double> conti = new HashMap<Integer, Double>();

    public Banca(){
        for(int i = 1; i <= 10; i++){
            conti.put(i, (double)5000);
        }
    }



    synchronized void bonifico(int ccOrdinate, int ccBenificiario, int importo) throws InterruptedException {
        if (!conti.containsKey(ccOrdinate)) {
            throw new RuntimeException("Conto ordinante non esistente.");
        }

        if (!conti.containsKey(ccBenificiario)) {
            throw new RuntimeException("Conto beneficiario non esistente.");
        }
        while(conti.get(ccOrdinate) < importo) {
            wait();
        }
        conti.put(ccOrdinate, (conti.get(ccOrdinate) - importo));
        conti.put(ccBenificiario, (conti.get(ccBenificiario) + importo));
        notifyAll();

        System.out.println("Bonifico eseguito: " + importo + " trasferito dal conto " + ccOrdinate + " al conto " + ccBenificiario);
        System.out.println(getPatrimonio());
    }

    double getPatrimonio() {
        double patrimonio = 0;
        for (double i : conti.values()) {
            patrimonio += i;
        }
        return patrimonio;
    }
}
