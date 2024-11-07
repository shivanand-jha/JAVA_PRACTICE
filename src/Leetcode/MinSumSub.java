package Leetcode;

public class MinSumSub {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];

            for (int j = i; j < arr.length; j++) {
                min =  Math.min(min,arr[j]);
                ans += min;
            }
        }
        System.out.println(ans);
    }
}
