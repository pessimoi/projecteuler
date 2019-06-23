package t18;

import java.util.Arrays;

public class MainT18 {

    public static void main(String[] args) {

        //  Maximum path sum I
        //  Problem 18
        //  By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
        //
        //     3
        //    7 4
        //   2 4 6
        //  8 5 9 3
        //
        //  That is, 3 + 7 + 4 + 9 = 23.
        //
        //  Find the maximum total from top to bottom of the triangle below:
        //
        //                                  75
        //                                95 64
        //                              17 47 82
        //                            18 35 87 10
        //                           20 04 82 47 65
        //                         19 01 23 75 03 34
        //                        88 02 77 73 07 63 67
        //                      99 65 04 28 06 16 70 92
        //                     41 41 26 56 83 40 80 70 33
        //                   41 48 72 33 47 32 37 16 94 29
        //                 53 71 44 65 25 43 91 52 97 51 14
        //               70 11 33 28 77 73 17 78 39 68 17 57
        //              91 71 52 38 17 14 91 43 58 50 27 29 48
        //            63 66 04 68 89 53 67 30 73 16 69 87 40 31
        //           04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
        //
        //  NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route.
        //  However, Problem 67, is the same challenge with a triangle containing one-hundred rows; it cannot be solved by brute force, and requires a clever method! ;o)

        String pyramid =
                "75\n" +
                "95 64\n" +
                "17 47 82\n" +
                "18 35 87 10\n" +
                "20 04 82 47 65\n" +
                "19 01 23 75 03 34\n" +
                "88 02 77 73 07 63 67\n" +
                "99 65 04 28 06 16 70 92\n" +
                "41 41 26 56 83 40 80 70 33\n" +
                "41 48 72 33 47 32 37 16 94 29\n" +
                "53 71 44 65 25 43 91 52 97 51 14\n" +
                "70 11 33 28 77 73 17 78 39 68 17 57\n" +
                "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
                "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
                "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

        String[] rows = pyramid.split("\n");

        int max = 0;
        int[] a = new int[50];
        int[] b = new int[50];

        a[0] = Integer.parseInt(rows[0]);

        //Going by dynamic approach - Creating the best sum row by row
        for(int i = 1; i < rows.length; i++){

            String[] row = rows[i].split(" ");

            for(int j = 0; j < row.length; j++){
                b[j] = Integer.parseInt(row[j]);

                if(j == 0){
                    b[j] += a[j];
                } else if (j == row.length-1){
                    b[j] += a[j-1];
                } else {
                    if(a[j] > a[j-1]){
                        b[j] += a[j];
                    } else {
                        b[j] += a[j-1];
                    }
                }

                if(b[j] > max){
                    max = b[j];
                }

            }
            a = Arrays.copyOf(b, a.length);
        }

        System.out.println(max);
    }

}
