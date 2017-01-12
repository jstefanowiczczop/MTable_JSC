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
        for (int rowIdx = 0; rowIdx < 11; rowIdx++) {
            System.out.print(rowIdx);

            for (int columnIdx = 0; columnIdx < 11; columnIdx++) {
                //dwucyfrowe
                if (rowIdx * columnIdx > 9 && rowIdx * columnIdx <= 99)
                    System.out.print(" " + columnIdx * rowIdx + " ");

                //jednocyfrowe`
                if (rowIdx * columnIdx < 10)
                    System.out.print("  " + columnIdx * rowIdx + " ");

                if (rowIdx * columnIdx == 100)
                    System.out.print(" " + columnIdx * rowIdx + " ");
            }
            System.out.println();
        }
    }
}


