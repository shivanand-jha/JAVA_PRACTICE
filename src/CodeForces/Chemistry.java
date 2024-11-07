package CodeForces;

import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
            int s = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int[] freq = new int[26];
            for (char x : str.toCharArray()) {
                freq[x-'a']^=1;
            }
            int c = 0;
            for(int x : freq) {
                if(x!=0){
                    c++;
                }
            }
            if(c<=k+1) System.out.println("Yes");
            else System.out.println("No");

        }
    }
}
