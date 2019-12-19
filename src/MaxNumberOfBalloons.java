/*Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
  You can use each character in text at most once. Return the maximum number of instances that can be formed.

        Input: text = "nlaebolko"
        Output: 1

        Input: text = "loonbalxballpoon"
        Output: 2

        Input: text = "leetcode"   Rule :: b-1 a-1 l-2 o-2 n-1
        Output: 0 */             //Input:: b-2 a-2 l-4 o-4 n-2       loonbalxballpoon
//Input:: b-4 a-1 l-3 o-2 n-1       nlaebolko
//Rule :: b-1 a-1 l-2 o-2 n-1

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class MaxNumberOfBalloons {

    public static void main(String[] args) {
        MaxNumberOfBalloons mx = new MaxNumberOfBalloons();
        System.out.println(mx.maxNumberOfBalloons("nlaebolko"));
        System.out.println(mx.maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(mx.maxNumberOfBalloons("leetcode"));
        System.out.println(mx.maxNumberOfBalloons("lloo"));
//
//
    }

    public int maxNumberOfBalloons(String text) {
        Map<String, Integer> map = getFrequency(text);
        int min = Integer.MAX_VALUE;
        for (int val : map.values()) {
            min = Math.min(min, val/2);
        }
        return min;
    }

    Map<String, Integer> getFrequency(String str) {
        Map<String, Integer> map = new HashMap<>();
        map.put("b",0);
        map.put("a",0);
        map.put("l",0);
        map.put("o",0);
        map.put("n",0);
        String[] split = str.split("");
        for (String s : split) {
            if(s.equals("b")){
                map.put(s, map.getOrDefault(s, 0) + 2);
            } else if(s.equals("a")){
                map.put(s, map.getOrDefault(s, 0) + 2);
            } else if(s.equals("l")){
                map.put(s, map.getOrDefault(s, 0) + 1);
            } else if(s.equals("o")){
                map.put(s, map.getOrDefault(s, 0) + 1);
            } else if(s.equals("n")){
                map.put(s, map.getOrDefault(s, 0) + 2);
            }
        }

        return map;
    }
}
