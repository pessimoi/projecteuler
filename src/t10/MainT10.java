package t10;

import java.util.HashMap;

public class MainT10 {

    public static void main(String[] args) {

        //  Summation of primes
        //  Problem 10
        //  The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
        //
        //  Find the sum of all the primes below two million.


        HashMap<Integer, Boolean> primes = new HashMap<>();

        int target = 2000000;
        long sum = 0;

        for(int i = 2; i < target; i++){

            if(!primes.containsKey(i)){
                primes.put(i, true);
                sum += i;

                for(int j = 2; i*j < target; j++){
                    primes.put(i*j, false);
                }

            }

        }

        System.out.println(sum);

    }

}
