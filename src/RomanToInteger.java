/*
   Example 1:

   Input: "III"
   Output: 3
   Example 2:

   Input: "IV"
   Output: 4
   Example 3:

   Input: "IX"
   Output: 9
   Example 4:

   Input: "LVIII"
   Output: 58
   Explanation: L = 50, V= 5, III = 3.
   Example 5:

   Input: "MCMXCIV"
   Output: 1994
   Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

   I can be placed before V (5) and X (10) to make 4 and 9.
   X can be placed before L (50) and C (100) to make 40 and 90.
   C can be placed before D (500) and M (1000) to make 400 and 900.
   Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
   */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        romanToInteger.romanToInt("MCMXCIV");
    }

    public int romanToInt(String s) {
        Map<String, Integer> map = getMap();
        String previous;
        String[] split = s.split("");
        for (String str : split) {
            previous = str;
            Integer integer = map.get(str);

        }

        return 0;
    }

    public static Map<String, Integer> getMap() {
        Map<String, Integer> map = new HashMap();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        return map;
    }
}
