package org.kras;

/*
https://leetcode.com/problems/longest-palindrome/description/
 */
public class LongestPalindrome {
    public int calculate(String s) {
        int size = s.length();
        if (size < 2) {
            return size;
        }
        int[] matrix = new int[58];
        for (int i = 0; i < size; i++) {
            matrix[s.charAt(i) - 'A']++;
        }
        int count = 0;
        for (int item : matrix) {
            count += item - (item % 2);
        }
        return count < size ? count + 1 : count;
    }
}
