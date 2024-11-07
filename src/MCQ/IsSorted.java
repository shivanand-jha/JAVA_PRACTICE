package MCQ;

import java.util.Arrays;
import java.util.Scanner;

public class IsSorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        System.out.println("Hello");
        System.out.println(minValue("abccc",2));
    }
    public  static int minValue(String s, int k){
        int[] ans = new int[26];
        for(int i=0; i<s.length(); i++){
            ans[s.charAt(i)-'a']++;
        }
        Arrays.sort(ans);
        help(ans,k);
        System.out.println(Arrays.toString(ans));
        int sum =0;
        for (int l = 0; l < 26; l++) {
            sum += Math.pow(ans[l],2);
        }
        return sum;
    }
    private static void help(int[] arr,int k){
        int j = arr.length-1;
        while(k-->0){
            while(arr[j]>arr[j-1] && k>0){
                arr[j] -=1;
                k--;
            }
            j--;
        }
    }
}
