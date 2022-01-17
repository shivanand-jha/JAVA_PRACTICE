import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int k  = 0; k<=i; k++)
        {
            for(int j =0;  j<k; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
