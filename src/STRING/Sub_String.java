package STRING;

import java.util.ArrayList;

public class Sub_String {
    public static void main(String[] args) {
        String s = "He    llo     ";
//        printSubstrings(s);
        System.out.println(s.replaceAll(" ",""));
    }

    private static void printSubstrings(String s) {
        for(int i=0; i<s.length(); i++)
        {
            for (int j = i+1; j < s.length()+1; j++) {
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }
}
