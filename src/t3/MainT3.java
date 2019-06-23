package t3;

public class MainT3 {

    public static void main(String[] args) {

        //  Largest prime factor
        //  Problem 3
        //  The prime factors of 13195 are 5, 7, 13 and 29.
        //
        //  What is the largest prime factor of the number 600851475143 ?

        long n = 600851475143L;

        for(long i = 2; i < n; i++){
            if(n % i == 0){
                n = n / i;
                i--;
            }
        }
        System.out.println(n);
    }



}