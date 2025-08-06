package org.kras;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        int lcs = LCS("abcdefsdfadsfadfdsfdf", "acesdflkjdfljalkfjladskjfkdjfdjfajf");
        System.out.println(lcs);
    }

    private static int LCS(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int[][] matrix = new int[l1 + 1][l2 + 1];
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    matrix[i][j] = 1 + matrix[i - 1][j - 1];
                } else {
                    matrix[i][j] = Math.max(matrix[i][j - 1], matrix[i - 1][j]);
                }
            }
        }
        return matrix[l1][l2];
    }
}
