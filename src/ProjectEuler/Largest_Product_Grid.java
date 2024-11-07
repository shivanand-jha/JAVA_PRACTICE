package ProjectEuler;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Largest_Product_Grid {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int l =2,r=2;
        long ans = largest_Product(arr,l,r);
    }

    private static long largest_Product(int[][] arr, int l, int r) {
        int nl = arr.length+(4*l);
        int nr = arr[0].length+(4*r);
        int[][] array = new int[nl][nr];

        long ans=0;
        for (int i = l; i < nl; i++) {
            for (int j = r; j < nr; j++) {
                array[i][j]=arr[i-l][j-r];
            }
        }
//        int i1=0;
//        for(int[] i :arr){
//            System.out.println(Arrays.toString(array[i1++]));
//        }

        return ans;
    }

}
