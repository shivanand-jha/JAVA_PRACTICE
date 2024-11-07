package Matrix;

import java.util.Scanner;

public class Create_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];
        for (int i=0; i<N; i++)
        {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        transpose(N,matrix);
        printMatrix(matrix);

    }
    public static void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void transpose(int n,int a[][])
    {
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
}
