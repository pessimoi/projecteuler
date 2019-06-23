package t5;

public class MainT5 {

    public static void main(String[] args) {

        //  Smallest multiple
        //  Problem 5
        //  2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
        //
        //  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

        int i = 1;

        while(i >= 1){

            int sum = 20 * i;

            for(int j = 20; j > 0; j--){
                if(j == 1){
                    System.out.println(sum);
                    i = 0;
                }
                if(sum % j != 0){
                    i++;
                    j = 0;
                }
            }
        }

    }

}
