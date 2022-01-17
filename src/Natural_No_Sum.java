import java.util.Scanner;

public class Natural_No_Sum {
    static int nrecsum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+nrecsum(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = nrecsum(n);
        System.out.print(c);
    }
}
