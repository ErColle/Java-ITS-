package Lambda;

public class CriterioPeso implements Criterio{
    @Override
    public boolean test(Mela mela) {
        if(mela.getPeso() > 100)
            return true;
        else
            return false;
    }
}
