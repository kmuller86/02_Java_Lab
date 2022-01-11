import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) MOJ INDEKS - 62849 */

        for(int i=1;i<=100;i++)
        {
            if(i%9==0)
            {
                System.out.println(i);
            }
        }
        System.out.println("");

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        Scanner scan = new Scanner(System.in);
        int[] tab = new int[5];
        for(int i=0;i<5;i++)
        {
            tab[i]=scan.nextInt();
        }
        for(int liczba : tab)
        {
            System.out.println(liczba+11);
        }
    }
}