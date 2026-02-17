package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static void main() {
        ArrayList<Prodotto> catalogo = new ArrayList<Prodotto>();
        catalogo.add(new Prodotto(133, "latte", "alimentare", 100, true, 2.5, 0));
        catalogo.add(new Prodotto(134, "latte UHT", "alimentare", 0, false, 2.5, 0));
        catalogo.add(new Prodotto(113, "pomodori", "alimentare", 50, true, 1.5, 5));
        catalogo.add(new Prodotto(123, "libro", "media", 10, true, 10, 5));
        catalogo.add(new Prodotto(155, "maglietta", "abbigliamento", 20, true, 25, 10));
        catalogo.add(new Prodotto(184, "cd musicale", "media", 0, false, 12.5, 0));
        catalogo.add(new Prodotto(143, "smartphone", "elettronica", 80, true, 250, 10));
        catalogo.add(new Prodotto(144, "cuffie", "elettronica", 0, false, 250, 40));

        //numero di categorie
        long numeroCategoria = catalogo.stream().map(prodotto -> prodotto.getCategoria()).distinct().count();
        System.out.println(numeroCategoria);

        //categorie ordinate in ordine alfabetico
        List<String> categorieOrdinate = catalogo.stream().map(prodotto -> prodotto.getCategoria())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(categorieOrdinate);

        //prodotti ordinati per prezzo crescente
        List<String> prodottiOrdinatiPrezzo = catalogo.stream()
                .sorted(Comparator.comparingDouble(prodotto -> prodotto.getPrezzo()))
                .map(prodotto -> prodotto.getDescrizione())
                .collect(Collectors.toList());

        System.out.println(prodottiOrdinatiPrezzo);

        //prodotti ordinati per sconto
        List<String> prodottiOrdinatiSconto = catalogo.stream()
                .sorted(Comparator.comparingDouble(prodotto -> prodotto.getSconto()))
                .map(prodotto -> prodotto.getDescrizione())
                .collect(Collectors.toList());

        System.out.println(prodottiOrdinatiSconto);

        //prodotto con lo sconto maggiore
        Prodotto prodottoSconto = catalogo.stream()
                .max(Comparator.comparingInt(prodotto -> prodotto.getSconto()))
                .get();

        System.out.println(prodottoSconto.toString());

        //somma prezzi prodotti alimentari
        double sommaProdottiAlimentari = catalogo.stream()
                .filter( p -> p.getCategoria() == "alimentare")
                .map(p -> p.getPrezzo())
                .reduce((p1, p2 ) -> (p1 + p2 ))
                .get();

        System.out.println(sommaProdottiAlimentari);

        // optional vuoto per categoria inesistente
        Optional categoriaInesistente = catalogo.stream()
                .filter( p -> p.getCategoria() == "culo")
                .findFirst();
        System.out.println(categoriaInesistente);

        //il prodotto con prezzo piu alto
        Prodotto prodottoPrezzoMedia = catalogo.stream()
                .filter( p -> p.getCategoria() == "media")
                .max(Comparator.comparingDouble( p -> p.getPrezzo()))
                .get();
        System.out.println(prodottoPrezzoMedia);

        // prodotti non disponibili
        List<Prodotto> prodottiNonDisponibili = catalogo.stream()
                .filter( p -> !p.isDisponibilita())
                .collect(Collectors.toList());

        System.out.println(prodottiNonDisponibili);


    }
}
