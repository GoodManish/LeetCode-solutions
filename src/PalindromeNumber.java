/*Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

        Example 1:

        Input: 121
        Output: true
        Example 2:

        Input: -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        Example 3:

        Input: 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
        Follow up:

        Could you solve it without converting the integer to a string?*/

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String rev = "";
        int temp, original = x;
        if(x==0){
            return true;
        }
        else if (x % 10 == 0 || x < 0) {
            return false;
        }
        while (x > 0) {
            temp = x % 10;
            x = x / 10;
            rev = rev + temp;
        }

        Long val = Long.parseLong(rev);
        if (val>Integer.MAX_VALUE || val<Integer.MIN_VALUE){
            return false;
        }
        return (Integer.parseInt(rev) == original) ? true : false;
    }

    public static void main(String[] args) {
        //Line 16: java.lang.NumberFormatException: For input string: "7463847412"
        PalindromeNumber palindromeNumber = new PalindromeNumber();
//        System.out.println(palindromeNumber.isPalindrome(0));
//        System.out.println(palindromeNumber.isPalindrome(010));
//        System.out.println(palindromeNumber.isPalindrome(121));
//        System.out.println(palindromeNumber.isPalindrome(-121));
//        System.out.println(palindromeNumber.isPalindrome(12));
//        System.out.println(palindromeNumber.isPalindrome(1030301));
//        System.out.println(palindromeNumber.isPalindrome(1200));
        int i = (int) (2147483647);
        System.out.println(palindromeNumber.isPalindrome(i));
    }
}
