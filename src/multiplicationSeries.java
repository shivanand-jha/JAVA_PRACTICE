import java.util.Scanner;

public class multiplicationSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. for multiplication table" );
        int n = sc .nextInt();
        int m;
        for (int i =1; i<=10; i++)
        {
            m = n*i;
            System.out.printf("%d X %d = %d \n", n,i,m );
        }
    }
}
