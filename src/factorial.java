import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , s=1 ;
        System.out.println("enter the number for factorial ");
        n= sc.nextInt();
        for (int i = 1;  i<=n; i++)
        {
            s = s*i;
        }
        System.out.println("the factorial is "+s);
    }
}
