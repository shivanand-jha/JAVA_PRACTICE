import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        System.out.println("enter the character");
        c = sc.next().charAt(0);
        if (c =='a' || c =='e' || c =='i' || c =='o'|| c == 'u') {
            System.out.println(c + " is vowel in lower case");
        } else if (c =='A' || c =='E' || c == 'I' || c == 'O' || c == 'U') {
            System.out.println(c + " is vowel in upper case");
        } else
        {
            System.out.println(c+" is consonant or any other character ");
        }
    }


}
