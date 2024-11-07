package HashSet;

import java.util.*;

public class Debasis_Sir_01 {
    public static void main(String[] args) {

//        System.out.println("Hello Computer vision Course // java course too !");
//        System.out.print("\t\t\t\t\t Debasis Samanta");
//        System.out.print("Hello Java!");
//        System.out.println("   Hi!");
//        System.out.print("Hello Java! \n" + "Hi!");
//        System.out.println();
//        System.out.print("1 2 3 4 \n");
//        System.out.print("5 6 7 8 \n");
//        System.out.print("9 10 11 12 \n");
//        ArrayList<Integer> ans = new ArrayList<>();
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int arr[] = {1,2,3,4,3,2};
//        for (int i = 0; i < arr.length; i++) {
//        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//        }
//
//
//        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
//            if(entry.getValue()==2)
//            {
//                ans.add(entry.getKey());
//            }
//        }
//        System.out.println(ans);
        String s = "eateeen";
        String t = "teaeeen";
        HashMap<Character,Integer> ch1 = new HashMap<>();
        HashMap<Character,Integer> ch2 = new HashMap<>();
        for (int i = 0; i < 7; i++) {
            ch1.put(s.charAt(i),ch1.getOrDefault(s.charAt(i),0)+1);
            ch2.put(t.charAt(i),ch2.getOrDefault(t.charAt(i),0)+1);
        }
        System.out.println(ch1.equals(ch2));
        String[] strs = {"abc", "ans", "DIG"};
        List<String> adv = new ArrayList<>(Arrays.asList(strs));
        System.out.println(adv);
//        List<List<String>> ans = new LinkedList<>();
//        String[] strs = {"eat","tea","tan","ate","nat","bat"};
//        groupAnagrams(strs);
    }

//        public static void groupAnagrams(String[] strs) {
//            List<List<String>> ans = new ArrayList<>();
//            List<String> an = new ArrayList<>();
//            List<String> and = new ArrayList<>(Arrays.asList(strs));
//            while(and.size()>0)
//            {
//
//                for(int i=0; i<and.size(); i++)
//                {
//                    if(isAnagram(and.get(0),and.get(i))){
//                        an.add(and.get(i));
//                        and.remove(and.get(i));
//                    }
//                }
//                ans.add(an);
//                an.clear();
//                System.out.println(ans);
//            }
//            return ans;
//        }
//        public static boolean isAnagram(String s, String t) {
//            int n  = s.length();
//            if(s.length()!=t.length()){return false;}
//            int[] alphabet = new int[26];
//            for (int i = 0; i < n; i++) {
//                alphabet[s.charAt(i) - 'a']++;
//                alphabet[t.charAt(i) - 'a']--;
//            }
//            for (int i : alphabet) if (i != 0) return false;
//            return true;
//        }

}
