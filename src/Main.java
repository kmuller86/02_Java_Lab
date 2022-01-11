import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */

        List<String> Lista = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for(int i=1;i<=5;i++)
        {
            Lista.add(scan.next());
        }
        wyswietlElementyListy(Lista);
        System.out.println();
        usunDwaOstatnieIDodajTrzyInne(Lista);
        System.out.println();
        wyswietlElementyListy(Lista);
        int wielkosc = Lista.size();
        System.out.printf("Lista zawiera: %d elementów",wielkosc);
        System.out.println();
        Collections.reverse(Lista);
        wyswietlElementyListy(Lista);


         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

    }
    static void wyswietlElementyListy(List<String> Lista)
    {
        Lista.forEach(System.out::println);
    }
    static void usunDwaOstatnieIDodajTrzyInne(List<String> Lista)
    {
        Lista.remove(4);
        Lista.remove(3);

        Lista.add("Koń");
        Lista.add("Zebra");
        Lista.add("Konik polny");
    }

}
