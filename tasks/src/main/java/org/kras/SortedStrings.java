package org.kras;

import java.util.Arrays;
import java.util.Comparator;
/*
[12, 7, -4, -2]

[1, -4, -2, 7, 121]

[17, 12, -2, -4]

[12, 7, -2, -4]

[-4, -2, 12, 7]

[17, 12, -4, -2]

[1, -2, -4, 12, 7]

 */
public class SortedStrings {
    public static void main(String[] args) {
        Integer[] values = {-4, -2, 12, 7};
        Arrays.sort(values, new Comparator<Integer>() {
            @Override
            public int compare(Integer v1, Integer v2) {
                return v1.toString().compareTo(v2.toString());
            }
        });
        System.out.println(Arrays.toString(values));
    }
}
