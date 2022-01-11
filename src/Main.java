import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        int [] liczby = new int[20];
        uzupelnijTablice(liczby);
        wypiszZawartoscTablicy(liczby);


        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */
        String [] slowo = new String[6];
        uzupelnijTabliceString(slowo);
        wypiszTabliceString(slowo);

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        String imie = "Arkadiusz";
        wypiszImie(imie);
        String nazwisko = "Kreft";
        wypiszImieINazwisko(imie, nazwisko);
        int wiek = 22;
        wypiszImieNazwiskoIWiek(imie, nazwisko, wiek);


        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

        int wynik = obliczSume(4,7);
        int wynik2 = obliczSume(5,8,13);

        System.out.print("Wynik = "+(obliczSume(1,8))+(obliczSume(1,7,19)));


    }
    static void uzupelnijTablice(int [] liczby)
    {
        int liczba = 40;
        for(int i=0;i<20;i++)
        {
            liczby[i]=liczba;
            liczba--;
        }
    }
    static void wypiszZawartoscTablicy(int[]liczby)
    {
        for(int i=0;i<20;i++)
        {
            System.out.println(liczby[i]);
        }
    }
    static void uzupelnijTabliceString(String [] slowo)
    {
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            slowo[i]=scan.next();
        }
    }
    static  void wypiszTabliceString(String [] slowo)
    {
        for(int i=5;i>=0;i--)
        {
            System.out.println(slowo[i]);
        }
    }
    static void wypiszImie(String imie)
    {
        System.out.println(imie);
    }
    static void wypiszImieINazwisko(String imie, String nazwisko)
    {
        System.out.println(imie);
        System.out.println(nazwisko);
    }
    static void wypiszImieNazwiskoIWiek(String imie, String nazwisko, int wiek)
    {
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(wiek);
    }
    static int obliczSume(int liczbaA, int liczbaB)
    {
        int wynik = liczbaA+liczbaB;
        return wynik;
    }
    static int obliczSume(int liczbaA, int liczbaB, int liczbaC)
    {
        int wynik = liczbaA+liczbaB+liczbaC;
        return wynik;
    }

}