public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (62849)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        int i = 1;
        do{
            if(i%49==0)
            {
                System.out.printf("Liczba %d jest podzielna przez %d\n",i,49);
            }
            i++;
        }while(i<=1000);
        System.out.println("");

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        int [] tab = {1,2,3,4,5};
        int j=0;
        while(j<=4)
        {
            System.out.println(tab[j]);
            j++;
        }
        System.out.println("");

        double [] tab2 = {1.1,2.2,3.3,4.4,5.5};

        int x =0;

        while(x<=4)
        {
            System.out.println(tab2[x]);
            x++;
        }

        String slowo = "tqewfasdasda";
        int z=slowo.length()-1;
        char temp;
        while (z>=0)
        {
            temp = slowo.charAt(z);
            System.out.print(temp);
            z--;
        }

        System.out.println("");

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)


        while(true) //Pętla wykonuje się w nieskończoność
        {
            System.out.println("Test");
        }


        while(false)
        {
            System.out.println("Test");
        }
         */

    }
}