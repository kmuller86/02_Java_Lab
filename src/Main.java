import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();

        switch (liczba%2)
        {
            case 0:
                System.out.println("Liczba jest parzysta!");
                break;
            case 1:
                System.out.println("Liczba jest nieparzysta!");
                break;
        }

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

        String slowo = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int licznikO=0,licznikP=0,licznikX=0,licznikZ=0,licznikQ=0,pozostale=0;
        char temp;

        for(int i=0;i<slowo.length();i++)
        {
            temp = slowo.charAt(i);
            if(temp=='o')
            {
                licznikO++;
            }
            else if(temp=='p')
            {
                licznikP++;
            }
            else if(temp=='x')
            {
                licznikX++;
            }
            else if(temp=='z')
            {
                licznikZ++;
            }
            else if(temp=='q')
            {
                licznikQ++;
            }
            else
            {
                pozostale++;
            }
        }
        System.out.println("Ilosc liter o: "+licznikO);
        System.out.println("Ilosc liter p: "+licznikP);
        System.out.println("Ilosc liter x: "+licznikX);
        System.out.println("Ilosc liter z: "+licznikZ);
        System.out.println("Ilosc liter q: "+licznikQ);
        System.out.println("Ilosc pozostalych liter: "+pozostale);

    }
}