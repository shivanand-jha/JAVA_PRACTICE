import java.util.Scanner;
public class swap {
    swap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter I value : ");
        int var1 = sc.nextInt();
        System.out.println("enter II value : ");
        int var2 = sc.nextInt();
        System.out.println("value of variable1 :"+var1);
        System.out.println("value of variable2 :"+var2);
        var1=var1+var2;
        var2=var1-var2;
        var1=var1-var2;

        System.out.println("Number After Swapping");
        System.out.println("value of variable1 :"+var1);
        System.out.println("value of variable2 :"+var2);

    }

    public static void main(String args[])
    {
        swap obj = new swap();
    }
}
