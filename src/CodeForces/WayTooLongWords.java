package CodeForces;

import java.util.Scanner;

public class WayTooLongWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
            String str = sc.next();
            String s = "";
            if(str.length()>10){
                s = ""+str.charAt(0);
                s += str.length()-2;
                s +=str.charAt(str.length()-1);
            }
            else {
                s = str;
            }
            System.out.println(s);
        }
//        String s = "pneumonoultramicroscopicsilicovolcanoconiosis";
//        System.out.println(s.length());
    }
}
