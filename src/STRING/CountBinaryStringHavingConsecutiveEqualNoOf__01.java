package STRING;

public class CountBinaryStringHavingConsecutiveEqualNoOf__01 {
    public static void main(String[] args) {
        String s = "00110011";
        int count = 0;
//        String temp = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i; j <= s.length(); j = j + 2) {
                String d = s.substring(i, j);
                if (check(d)) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }

    private static boolean check(String temp) {
        if(temp.length()<2){
            return false;
        }
        int l=0;
        int h=temp.length()-1;
        if('0' == temp.charAt(0))
        {
            while (l<h) {
                if (temp.charAt(l) == '0' && temp.charAt(h) == '1') {
                    l++;
                    h--;
                } else return false;
            }
        }else {
            while (l < h){
                if (temp.charAt(l) == '1' && temp.charAt(h) == '0') {
                    l++;
                    h--;
                } else return false;
            }
        }
        return true;
    }
}

