import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* cw.4  */
 
        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();
        for(int i=0;i<liczba;i++)
        {
            if(i==49)
            {
                break;
            }

        }
        System.out.println("Pętla osiągnęła liczbę 49");
        System.out.println("");
        for(int i=0;i<liczba;i++)
        {
            if(i!=49)
            {
                continue;
            }
            else
            {
                System.out.println("Pętla osiągnęła liczbę 49");
            }
        }
        for(int i=0;i<liczba;i++)
        {
            if(i==49)
            {
                return;
            }
        }
    }
}