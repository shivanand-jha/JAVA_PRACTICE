import java.util.Scanner;

public class String_Halves {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s =sc.next();
        System.out.println(halvesAreAlike(s));
    }
        public static  boolean halvesAreAlike(String s) {
            int len=s.length()-1;
            //    s.toLowerCase();
            int a = 0;
            int c1 = 0;
            int c2 = 0;
            while(a<len)
            {
                if(isVowel(s.charAt(a)))
                {
                    c1++;
                }
                if(isVowel(s.charAt(len)))
                {
                    c2++;
                }
                a++;
                len--;
            }
            return c1 == c2 ;
        }
        public static boolean isVowel(char ch){
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
        }

}
