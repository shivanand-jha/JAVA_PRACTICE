package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class CanForm {
    public static void main(String[] args) {
        String[] words = {"cat", "hat","bn","billion"};
        String chars = "atach";
        System.out.println(countCharacters(words,chars));
    }
    public static int countCharacters(String[] words, String chars) {
        int result = 0;
        for(String str : words){
            if(canForm(str,chars)){
                result += str.length();
            }
        }
        return result;
    }
    public static boolean canForm(String str , String chars){
        if(str.length()>chars.length()){
            return false;
        }
        List<Character> temp = new ArrayList<>();
        for(char x : chars.toCharArray()){
            temp.add(x);
        }
        for(int i = 0 ; i<str.length(); i++){
            if(!temp.contains(str.charAt(i))){
                return false;
            }
            else{
                temp.remove(str.charAt(i));
            }
        }
        return true;
    }
}
