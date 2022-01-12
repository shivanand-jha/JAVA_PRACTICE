import java.util.Scanner;

public class compute_Quotient_and_Remainder {
    public static void main(String[] args) {
        int dividend,divisor;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the dividend and divisor ");
        dividend= sc.nextInt();
        divisor =sc.nextInt();
        float quotient = dividend/divisor;
        int remainder = dividend%divisor;
        System.out.println("Quotient "+quotient+"and "+remainder+"remainder ");

    }
}
