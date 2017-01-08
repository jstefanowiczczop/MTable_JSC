package multiplicationTable;

/**
 * Created by Jola on 2016-12-11.
 */

public class MultiplicationTable  {
     private int x ;


  public static void main(String[] args) {
        int j;
        int i;
        int b;
        System.out.print("x  ");
        for (b = 0; b < 11; b++) {
            System.out.print("" + b + "   ");

        }
        System.out.print("\n");
        // i = numer wiersza
        for (i = 0; i < 11; i++) {
            System.out.print(i);

            //j= numer kolumny
            for (j = 0; j < 11; j++) {

                //dwucyfrowe
                if (i * j > 9 && i * j <= 99)
                    System.out.print(" " + j * i + " ");

                {//jednocyfrowe`
                    if (i * j < 10)
                        System.out.print("  " + j * i + " ");
                    {
                        if (i * j == 100)

                            System.out.print(" " + j * i + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}


