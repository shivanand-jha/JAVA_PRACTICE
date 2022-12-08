import java.util.Scanner;

public class Sort_String_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
        int t = sc.nextInt();
        while(t-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<b)
            {
                System.out.println("PROFIT");
            }
            else if (a>b)
            {
                System.out.println("LOSS");
            }
            else {
                System.out.println("NEUTRAL");
            }
        }
    }
}
