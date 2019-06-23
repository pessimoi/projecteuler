package t17;

import java.util.HashMap;

public class MainT17 {

    private static HashMap<Integer, String> numbers = new HashMap<>();

    public static void main(String[] args) {

        //  Number letter counts
        //  Problem 17
        //  If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
        //
        //  If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
        //
        //
        //  NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
        //  The use of "and" when writing out numbers is in compliance with British usage.

        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        numbers.put(6, "six");
        numbers.put(7, "seven");
        numbers.put(8, "eight");
        numbers.put(9, "nine");
        numbers.put(10, "ten");
        numbers.put(11, "eleven");
        numbers.put(12, "twelve");
        numbers.put(13, "thirteen");
        numbers.put(14, "fourteen");
        numbers.put(15, "fifteen");
        numbers.put(16, "sixteen");
        numbers.put(17, "seventeen");
        numbers.put(18, "eighteen");
        numbers.put(19, "nineteen");
        numbers.put(20, "twenty");
        numbers.put(30, "thirty");
        numbers.put(40, "forty");
        numbers.put(50, "fifty");
        numbers.put(60, "sixty");
        numbers.put(70, "seventy");
        numbers.put(80, "eighty");
        numbers.put(90, "ninety");
        numbers.put(1000, "onethousand");


        int sum = 0;
        for(int i = 1; i <= 1000; i++){

            String s;

            int length = ("" + i).length();

            if(numbers.containsKey(i)){
                s = numbers.get(i);
            } else if (length == 2) {
                s = numbers.get(i / 10 * 10) + numbers.get(i % 10);
            } else {

                s = numbers.get(i / 100) + "hundred";

                int c = i % 100;

                if(c != 0){
                    s = s + "and";

                    if(numbers.containsKey(c)){
                        s = s + numbers.get(c);
                    } else {
                        s = s + numbers.get(c / 10 * 10) + numbers.get(c % 10);
                    }
                }
            }

            sum += s.length();

        }

        System.out.println("Sum: " + sum);

    }

}
