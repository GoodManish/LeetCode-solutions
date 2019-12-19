//-check num=1 ..return true
//-split integer for all places
//-square the numbers for each places&add
//-check number=1or not
//-repeat

/*      Input: 19
        Output: true
        Explanation:
        1 + 9 = 82
        8 + 2 = 68
        6 + 8 = 100
        1 + 0 + 0 = 1 */

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean checkHappyNumber(int num) {
        int sum = 0;
        if (num == 1) return true;
        Set<Integer> uniqueNumbersEncounterd = new HashSet<Integer>();

        while (num > 1 && uniqueNumbersEncounterd.add(num)) {
            String s = Integer.toString(num);
            char[] chars = s.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                String si = String.valueOf(chars[i]);
                int parseInt = Integer.parseInt(si);
                sum = sum + parseInt * parseInt;
            }
            if (sum != 1) {
                num = sum;
                sum = 0;
                continue;
            } else {
                return true;
            }
        }

        return false;
    }

    static boolean isHappyNumber(int numberToCheck) {
        Set<Integer> uniqueNumbersEncounterd = new HashSet<Integer>();

        //Just to avoid any infinite loop
        while (uniqueNumbersEncounterd.add(numberToCheck)) {
            int value = 0;
            while (numberToCheck > 0) {
                value += Math.pow(numberToCheck % 10, 2);
                numberToCheck /= 10;
            }
            numberToCheck = value;
        }

        return numberToCheck == 1;
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println("19 - "+happyNumber.checkHappyNumber(19)); //310, 70, 86, 130, 7, 5555, 1212, 13
        System.out.println("310 - "+happyNumber.checkHappyNumber(310));
        System.out.println("70 - "+happyNumber.checkHappyNumber(70));
        System.out.println("86 - "+happyNumber.checkHappyNumber(86));
        System.out.println("130 - "+happyNumber.checkHappyNumber(130));
        System.out.println("7 - "+happyNumber.checkHappyNumber(7));
        System.out.println("5555 - "+happyNumber.checkHappyNumber(5555));
        System.out.println("1212 - "+happyNumber.checkHappyNumber(1212));
        System.out.println("13 - "+happyNumber.checkHappyNumber(13));
        System.out.println("2 - "+happyNumber.checkHappyNumber(2));
//        System.out.println(happyNumber.isHappyNumber(32));
//        System.out.println(happyNumber.isHappyNumber(24));
        System.out.println("24 - "+happyNumber.checkHappyNumber(24));

    }

}
