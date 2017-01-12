package multiplicationTable;

/**
 * Created by Jola on 2016-12-11.
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("x  ");
        for (int b = 0; b < 11; b++) {
            System.out.print("" + b + "   ");
        }
        System.out.print("\n");
        // i = numer wiersza
        for (int i = 0; i < 11; i++) {
            System.out.print(i);

            //j= numer kolumny
            for (int j = 0; j < 11; j++) {
                //dwucyfrowe
                if (i * j > 9 && i * j <= 99)
                    System.out.print(" " + j * i + " ");

                //jednocyfrowe`
                if (i * j < 10)
                    System.out.print("  " + j * i + " ");

                if (i * j == 100)
                    System.out.print(" " + j * i + " ");
            }
            System.out.println();
        }
    }
}


