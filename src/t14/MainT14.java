package t14;

public class MainT14 {

    public static void main(String[] args) {

        //  Longest Collatz sequence
        //  Problem 14
        //  The following iterative sequence is defined for the set of positive integers:
        //
        //  n → n/2 (n is even)
        //  n → 3n + 1 (n is odd)
        //
        //  Using the rule above and starting with 13, we generate the following sequence:
        //
        //  13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
        //  It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
        //
        //  Which starting number, under one million, produces the longest chain?
        //
        //  NOTE: Once the chain starts the terms are allowed to go above one million.


        int chain = 1;
        int max = 0;
        long longest = 0;

        for(long i = 113383; i < 1000000; i++){

            long collatz = i;
            System.out.println(collatz);

            while(collatz != 1){
                if(collatz % 2 == 0){
                    collatz /= 2;
                } else {
                    collatz = 3 * collatz + 1;
                }
                chain++;
            }

            System.out.println("Chain: " + chain);
            System.out.println();

            if(chain > max){
                max = chain;
                longest = i;
            }

            chain = 1;

        }

        System.out.println("Longest: " + longest);
        System.out.println("BIGGEST CHAIN: " + max);

    }

}
