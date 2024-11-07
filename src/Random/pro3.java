import java.util.Scanner;

public class pro3 {
    public static void main(String[] args) {
        //to add to integer
        int n1, n2 ,n3;
        System.out.println("enter first number ");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        System.out.println("enter second number");
        n2 = sc.nextInt();
        n3 = n1+n2;
        System.out.println("the sum of numbers :"+n3);
    }
}
