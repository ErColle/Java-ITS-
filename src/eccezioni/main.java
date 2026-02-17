package eccezioni;

import java.io.FileReader;
import java.io.IOException;

public class main {
    static void main() {


        try {
            FileReader reader = new FileReader("file.txt");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public Double dividi(Integer a, Integer b) throws ArithmeticException{
        return (double) (a/b);
    }
}