package t20;

import java.util.Arrays;

public class MainT20 {

    public static void main(String[] args) {

        //  Factorial digit sum
        //  Problem 20
        //  n! means n × (n − 1) × ... × 3 × 2 × 1
        //
        //  For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
        //  and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
        //
        //  Find the sum of the digits in the number 100!


        int n = 100;

        int length = 1000;
        int[] factor = new int[length];

        factor[length-1] = 1;


        for(int i = 1; i <= n; i++){

            String luku = "";

            //Creating string for allekkainlasku (sumStrings)
            for(int j = length-1; j >= 0; j--){

                if(factor[j] > 0){

                    luku =  luku + (factor[j]*i);

                    for(int k = j; k < length-1; k++){
                        luku = luku + "0";
                    }
                    luku = luku + "\n";
                    factor[j] = factor[j]*i;
                }
            }

            String sumString = sumStrings(luku);

            Arrays.fill(factor, 0);

            String reverse = "";

            //Reverse the sumString for the logic above for next loop
            for(int j = 0; j < sumString.length(); j++) {
                reverse = sumString.charAt(j) + reverse;
            }

            //Set the factor table with reversed sumString for calculation logic
            for(int j = 0; j < sumString.length(); j++){
                factor[length-(1+j)] = Character.getNumericValue(reverse.charAt(j));
            }

            //Printing sum when factorial n is reached
            //sumString sometimes contains additional leading zero from sumStrings, but doesn't matter for end sum calculation
            if(i == n){

                int sum = 0;

                for(int j = 0; j < sumString.length(); j++){
                    sum = sum + Character.getNumericValue(sumString.charAt(j));
                }

                System.out.println("SUMSTRING: " + sumString);
                System.out.println("SUM: " + sum);
            }

        }
     }

    private static String sumStrings(String s) {

        String[] rows = s.split("\n");

        String finalSum = "";
        int height = rows.length;
        int sum = 0;
        int max = 0;

        //Check max string length
        for (String row : rows) {
            if (row.length() > max) {
                max = row.length();
            }
        }

        //Add leading zeroes
        for(int i = 0; i < rows.length; i++){

            int zeroes = max - rows[i].length();

            if(zeroes > 0){
                String zeroesString = "";

                for(int j = 0; j < zeroes; j++){
                    zeroesString = zeroesString + "0";
                }

                rows[i] = zeroesString + rows[i];
            }
        }


        String sumString;

        for(int i = max-1; i >= 0; i--){

            //Counts sum of the column
            for(int j = 0; j < height; j++){
                sum += Character.getNumericValue(rows[j].charAt(i));
            }

            if(sum > 0){
                //Adds last digit from sum to final
                sumString = "" + sum;
                finalSum = sumString.charAt(sumString.length()-1) + finalSum;
            } else {
                finalSum = "0" + finalSum;
            }

            //Removes last digit from sum
            sum = sum/10;

        }

        return sum + finalSum;

    }

}



