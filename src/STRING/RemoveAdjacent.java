package STRING;

import java.util.Stack;

public class RemoveAdjacent {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
        Stack<Character> aa = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            if(!aa.isEmpty() && aa.peek()==s.charAt(i))
                aa.pop();
            else{
                aa.push(s.charAt(i));
            }
            System.out.println(aa);
        }
        String res = "";
        for(int i=0; i<aa.size(); i++)
        {
            res += aa.get(i);
        }
        return res;
    }
}
