package Matrix;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
//        String str = "eat","tea","tan","ate","nat","bat";
        String s = "abcdefeeee";
        String t = "abcdefeeed";
//        int[] arr = new int[26];
//        for(int i=0; i<s.length(); i++)
//        {
//            arr[Math.abs(97-s.charAt(i))]++;
//        }
//        System.out.println(Arrays.toString(arr));
//        String res ="";
//        ArrayList<Character> a   = new ArrayList<>();
//        for(char c: s.toCharArray())
//        {
//            a.add(c);
//        }
//        System.out.println(a);
        System.out.println(anag(s,t));
    }
    public static boolean anag(String s , String t)
    {
        if(s.length()!=t.length()) return false;
        ArrayList<Character> a   = new ArrayList<>();
        ArrayList<Character> b   = new ArrayList<>();
        for(char c: s.toCharArray())
        {
            a.add(c);
        }
        for(char c: t.toCharArray())
        {
            b.add(c);
        }
        for(int i=0; i<s.length(); i++)
        {
            if(!b.contains(a.get(i)))
            {
                return false;
            }
        }
        return true;
    }
}
