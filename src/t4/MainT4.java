package t4;

public class MainT4 {

    private static int max = 0;

    public static void main(String[] args) {

        //  Largest palindrome product
        //  Problem 4
        //  A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
        //
        //  Find the largest palindrome made from the product of two 3-digit numbers.

        // Could have just solved with simple string reversal comparison, but wanted to do this way instead

        for(int i = 100; i <= 999; i++){
            for(int j = 100; j <= 999; j++){
                checkIfPalindrome("" + i*j);
            }
        }
        System.out.println(max);
    }

    private static void checkIfPalindrome(String s) {

        String original = s;

        while(true) {

            if (s.charAt(0) == s.charAt(s.length()-1)) {
                if (s.length() == 1 || s.length() == 2) {
                    if(Integer.parseInt(original) > max){
                        max = Integer.parseInt(original);
                    }
                    break;
                } else if (s.length() > 2) {
                    s = s.substring(1, s.length() - 1);
                }

            } else {
                break;
            }
        }
    }

}
