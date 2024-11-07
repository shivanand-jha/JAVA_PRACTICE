package CodeForces;

import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(execute(s,t));
    }
    public static int execute(String s , String t){
        s  = s.toLowerCase();
        t  = t.toLowerCase();
        if(s.equals(t))return 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)<t.charAt(i)) {
                return -1;
            }
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>t.charAt(i)){
                return 1;
            }
        }
        return 0;
    }
}
