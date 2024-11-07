package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class MatDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n= sc.nextInt();
        int[][] mat = new int[m][n];
        int c= 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = ++c;
            }
        }
        System.out.println(Arrays.toString(mat[4]));
    }
}
