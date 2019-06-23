package t7;

import java.util.ArrayList;

public class MainT7 {

    public static void main(String[] args) {

        //  10001st prime
        //  Problem 7
        //  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
        //
        //  What is the 10 001st prime number?

        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);

        for(int i = 3; i < Integer.MAX_VALUE; i++){

            boolean isPrime = true;

            for (int prime: primes) {
                if(i % prime == 0){
                    isPrime = false;
                }
            }

            if(isPrime){
                primes.add(i);
            }

            if(primes.size() == 10001){
                System.out.println(i);
                break;
            }

        }

    }
}
