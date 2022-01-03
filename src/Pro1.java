import java.util.Scanner;
public class Pro1 {
    public static void main(String[] args) {
        abc x = new abc();
        int vol_of_cuboid;
        float sur_area;
        Scanner sc = new Scanner(System.in);
        x.a = sc.nextInt();
        x.b = sc.nextFloat();
        x.c = sc.next();
        System.out.println(x.a+"\n"+x.b+"\n"+x.c);
    }
}
class abc {
    int a;
    float b;
    String c;
}