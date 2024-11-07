import java.util.Scanner;

public class largest_Among_three {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a,b,c;
        System.out.println("enter the number a,b,c");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        if (a>b && a>c){
            System.out.println(a +" is greater number");
        }
        else if (b>a && b>c){
            System.out.println(b +" is greater number");
        }else if (c>a && c>b)
        {
            System.out.println(c +" is greater number ");
        }
        else {
            System.out.println("all equal");
        }
    }
}
