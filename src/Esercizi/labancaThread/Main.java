package Esercizi.labancaThread;

public class Main {
    static void main() throws InterruptedException {
        Banca banca = new Banca();

        ThreadConto tc1 = new ThreadConto( banca, 1 );
        ThreadConto tc2 = new ThreadConto( banca, 2 );
        ThreadConto tc3 = new ThreadConto( banca, 3 );
        ThreadConto tc4 = new ThreadConto( banca, 4 );
        ThreadConto tc5 = new ThreadConto( banca, 5 );
        ThreadConto tc6 = new ThreadConto( banca, 6 );
        ThreadConto tc7 = new ThreadConto( banca, 7 );
        ThreadConto tc8 = new ThreadConto( banca, 8 );
        ThreadConto tc9 = new ThreadConto( banca, 9 );
        ThreadConto tc10 = new ThreadConto( banca, 10 );

        ThreadPatrimonio p1 = new ThreadPatrimonio(banca);

        tc1.start();
        tc1.sleep(300);
        tc2.start();
        tc2.sleep(300);
        tc3.start();
        tc3.sleep(300);
        tc4.start();
        tc4.sleep(300);
        tc5.start();
        tc5.sleep(300);
        tc6.start();
        tc6.sleep(300);
        tc7.start();
        tc7.sleep(300);
        tc8.start();
        tc8.sleep(300);
        tc9.start();
        tc9.sleep(300);
        tc10.start();
        tc10.sleep(300);
    }
}
