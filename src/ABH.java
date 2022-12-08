import java.util.Scanner;

public class ABH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        while (t1-->0)
        {
            int s = sc.nextInt();
            double t = sc.nextInt();
             t = Math.pow(2.0,t);
            System.out.println(t-(t/(2*s)));
        }
    }
}
