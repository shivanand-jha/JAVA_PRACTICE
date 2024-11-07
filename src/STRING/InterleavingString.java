package STRING;

import java.util.*;

public class InterleavingString {
    public static void main(String[] args) {
//        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
//        System.out.println(isInterleave(s1,s2,s3));
    }
    public static boolean isInterleave(String s1, String s2, String s3) {
        int p = s1.length();
        int q = s2.length();
        int r = s3.length();
        if(p+q!=r) return false;
        Queue<Character> a = new ArrayDeque<>();
        Queue<Character> b = new ArrayDeque<>();
        for(int i=0; i<p; i++)
        {
            a.offer(s1.charAt(i));
        }
        System.out.println(a);
        for(int i=0; i<q; i++)
        {
            b.offer(s2.charAt(i));
        }
        System.out.println(b);
        System.out.println(s3);
        for(int i=0; i<r; i++)
        {
            if(a.size()>0 && s3.charAt(i)==a.peek())
            {
                a.poll();
            }
            else if(b.size()>0 && s3.charAt(i)==b.peek())
            {
                b.poll();
            }else{
                return false;
            }
        }
        return true;
    }
}
