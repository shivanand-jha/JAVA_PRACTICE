public class Hindi_varnmala {
    public static void main(String[] args) {

        int ascii = 0X0900;
        // first hexadecimal value for devanagari hindi varnmala
        for ( int i =ascii; i<=0X0970;i++) {
            System.out.print((char) i+" ");
        }

    }
}
