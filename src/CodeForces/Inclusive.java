package CodeForces;

import java.util.Scanner;

public class Inclusive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
             int s = sc.nextInt();
             int b = sc.nextInt();
             int[] arr = new int[s];
             for (int i = 0; i < s; i++) {
                    arr[i] = sc.nextInt();
             }
            int even =0,ans=b;
            for (int i = 0; i < s; i++) {
                int x =sc.nextInt();
                if (x%2==0) {
                    even++;
                }if(x%b==0){
                    ans=0;
                }
                ans= Math.min(ans,b-x%b);

            }
            if(b==4){
                if (even>=2) {
                    ans=0;
                }else if(even ==1){
                    ans = Math.min(ans,1);
                }else
                {
                    ans = Math.min(ans,2);
                }
            }
//            System.out.println(arr.equals(arr));
            System.out.println(ans);
        }

    }

}
