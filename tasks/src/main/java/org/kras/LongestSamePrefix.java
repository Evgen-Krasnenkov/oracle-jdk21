package org.kras;
/*
https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestSamePrefix {
    public static void main(String[] args) {

    }

    private static  String longestCommonPrefix(String[] strs) {
        int min = 0;
        for (int i = 1; i < strs.length; i++){
            int j = 0;
            while(j < strs[0].length() && j < strs[i].length()) {
                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    min = Math.min(min, j);
                    break;
                }
            }
        }
        return strs[0].substring(min);
    }
}
