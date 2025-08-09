package org.kras;

import java.util.Arrays;

/*
https://leetcode.com/problems/assign-cookies/description/
 */
public class AssignCookies {
    public static void main(String[] args) {
        int[] greed = {3,4,1,2,6,4,24,45,24,5,6,8,2,3,5};
        int[] sizes = {2,3,1,2,3,4,4,5,7,3,45,6,4,5,45,63,4,65};
        int i = calculateAssignedCookies(greed, sizes);
        System.out.println(i);
    }
    private static int calculateAssignedCookies(int[] greed, int [] cookieSizes) {
        Arrays.sort(greed);
        Arrays.sort(cookieSizes);
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < greed.length && j < cookieSizes.length) {
            if (greed[i] <= cookieSizes[j]) {
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}
