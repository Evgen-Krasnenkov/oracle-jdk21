package org.kras;
/*
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 */
public class FirstOccurrence {
    public static void main(String[] args) {
        int s = firstOccurrence("leetcode", "leeto");
        int i = firstOccurrence("sadbutsad", "sad");
        System.out.println(i);
    }
    private static int firstOccurrence(String haystack, String needle) {
        int hSize = haystack.length();
        int nSize = needle.length();
        if (nSize > hSize) {
            return - 1;
        }
        int result = - 1;
        int increment = 0;
        for (int i = 0; i < hSize; i++) {

            while (
                    (increment < nSize && (i + increment < hSize))
                            && (haystack.charAt(i + increment) == needle.charAt(increment))
            ) {
                if (increment == nSize - 1) {
                    return i;
                }
                increment++;
            }
        }
        return result;
    }
    public int strStr(String haystack, String needle) {
        int a = haystack.indexOf(needle);
        return a;
    }
}
