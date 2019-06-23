package t16;

import java.util.Arrays;

public class MainT16 {

    public static void main(String[] args) {

        //  Power digit sum
        //  Problem 16
        //  2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
        //
        //  What is the sum of the digits of the number 2^1000?

        int max = 1000;
        int[] pow = new int[max]; //This isn't proper logic for the array size
        int[] plus = new int[max]; //This isn't proper logic for the array size

        Arrays.fill(pow, 0);
        pow[max-1] = 1;

        for(int i = 0; i < max; i++){
            for(int j = max-1; j >= 0; j--){

                if(pow[j] > 0){

                    pow[j] = pow[j] * 2;


                    if(pow[j] > 9){

                        String s = "" + pow[j];
                        pow[j] = Integer.parseInt(s.substring(s.length()-1));
                        plus[j-1] = Integer.parseInt(s.substring(0, 1));
                    }

                }

            }

            //Adding zeroes
            boolean nonZero = false;
            for(int j = 0; j < max; j++){

                if(nonZero == false && plus[j] != 0){
                    nonZero = true;
                }

                if(nonZero){
                    pow[j] = pow[j] + plus[j];

                }

            }

            //Creating the final sum and print out of the seperate numbers
            if(i == max-1) {
                String printNum = "";
                int sum = 0;
                nonZero = false;
                for (int j = 0; j < max; j++) {

                    if (nonZero == false && pow[j] != 0) {
                        nonZero = true;

                    }

                    if (nonZero) {
                        printNum = pow[j] + printNum;
                        sum += pow[j];
                    }

                }

                System.out.println("Num: " + printNum);
                System.out.println("Sum: " + sum);

                Arrays.fill(plus, 0);
                System.out.println();
            }
        }
    }
}
