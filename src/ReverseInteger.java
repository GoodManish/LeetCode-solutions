/*
Given a 32-bit signed integer, reverse digits of an integer.

Input: 123
Output: 321

Input: -123
Output: -321

Input: 120
Output: 21
Note**: Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

class ReverseInteger {
    public int reverse(int x) {
        String s = "";
        boolean flag = false;

        String str = String.valueOf(x);
        if (x < 0) {
            str = str.substring(1);
            flag = true;
        }

        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            s = s + chars[i];
        }
        if (flag) {
            String negative = "-";
            s = negative + s;
        }
        Long val = Long.parseLong(s);
        if (val > Integer.MAX_VALUE || val < Integer.MIN_VALUE) {
            System.out.println("[value > Integer.Max_Value & < Integer.Min_Value]");
            return 0;
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse2(2147483647));
    }

    public int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x/10;

            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public int reverse3(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        try {
            return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

