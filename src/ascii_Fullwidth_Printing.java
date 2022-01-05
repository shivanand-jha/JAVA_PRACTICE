public class ascii_Fullwidth_Printing {
    public static void main(String[] args) {
        int as = 0Xff01;//hexadecimal value for first ascii fullwidth
        for(int i=as; i<=0Xff64;i++)
        {
            System.out.print((char)i);
        }
    }
}
