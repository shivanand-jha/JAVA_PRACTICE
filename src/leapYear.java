import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int n;
        boolean leap;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        n= sc.nextInt();
        if (n%4==0){
            if (n%100==0) leap = n % 400 == 0;
            else leap=true;
        }else
            leap = false;
        if (leap){
            System.out.println(n +" is a leap year");
        }else
            System.out.println(n +" is not a leap year");
    }
}
