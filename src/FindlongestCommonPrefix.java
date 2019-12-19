
class FindlongestCommonPrefix {
    public static void main(String[] args) {
        FindlongestCommonPrefix fl = new FindlongestCommonPrefix();
        System.out.println(fl.longestCommonPrefix(new String[]{"geeksforgeeks", "geeks", "geek", "geezer"}));
        System.out.println("-"+fl.longestCommonPrefix(new String[]{})+"-");
    }

    public String longestCommonPrefix(String[] strs) {

//        int minValue = strs[0].length();
//        for (int k = 1; k < strs.length; k++) {
//            if (strs[k].length() < minValue) {
//                minValue = strs[k].length();
//            }
//        }
        String commonPrefix = "";
        if (strs.length > 0) {
            commonPrefix = strs[0];
        }
        for (int i = 1; i < strs.length; i++) {
            commonPrefix = commonPrefixUtil(commonPrefix, strs[i]);
        }

        return commonPrefix;
    }

    public String commonPrefixUtil(String s1, String s2) {
        String result = "";
        int length1 = s1.length();
        int length2 = s2.length();

        for (int i = 0, j = 0; i < length1 && j < length2; i++, j++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                break;
            } else
                result += s1.charAt(i);
        }

        return result;
    }
}
