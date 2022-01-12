import java.util.Scanner;

public class sumofNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for sum ");
        int n =sc.nextInt();
        int s=0;
//        int r = (n*(n+1))/2;
//        System.out.println("the sum of natural number till "+n+" is "+r);
        // by  using loop
        for(int i = 0; i<=n; i++){
            s = s+i;}
            System.out.println(" the sum of natural number is : "+s);
}

}