package t15;

import java.util.Arrays;

public class MainT15 {

    public static void main(String[] args) {

        //  Lattice paths
        //
        //  Problem 15
        //  Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
        //  there are exactly 6 routes to the bottom right corner.
        //
        //  ___    __    _
        //  * *|   *|_    |
        //     V   * *V   |_>
        //
        //  |* *   |        |* *
        //  ---    -- *     |* *
        //     V   * |_>    |-->
        //
        //  How many such routes are there through a 20×20 grid?


        int w = 20;
        int h = 20;

        long[][] grid = new long[h+1][w+1];

        for(int i = 0; i <= h; i++){
            Arrays.fill(grid[i], 1);
        }

        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= w; j++){
                grid[i][j] = grid[i][j-1] + grid[i-1][j];
            }
        }

        System.out.println(grid[h][w]);

        //        Logic
        //        1 1 1
        //        1 2 3
        //        1 3 6
        //
        //        * * * *
        //        * * * *
        //        * * * *
        //        * * * *
        //
        //        1 1 1 1
        //        1 2 3 4
        //        1 3 6 10
        //        1 4 10 20


    }

}
