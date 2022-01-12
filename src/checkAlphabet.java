import javax.naming.directory.SchemaViolationException;
import java.util.Scanner;

public class checkAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any character");
        char c = sc.next().charAt(0);
        if((c>='a' && c<='z') || (c<='Z' &&  c>='A')){
            System.out.println(c +" is an alphabet");
        }else
            System.out.println(c +" is not an alphabet");
    }
}
