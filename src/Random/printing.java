public class printing {
    public static void main(String[] args) {
        int a = 10;
        float b = 45.6f;
        char c = 'A';
//        System.out.println(a+""+b+""+c);
//        System.out.println(a+" "+b+" "+c);
//        System.out.println(a+b+c);
//        System.out.println(a+b+" "+c);
//        System.out.printf("hello %d%f%c\n",a,b,c);//printing without spaces simple concatenation of string
//        System.out.printf("hello %d %f %c\n",a,b,c);//printing with spaces
//        System.out.printf("hello %o \n",a);//printing octal value
//        System.out.printf("hello %x \n",a);//printing hexadecimal value
//        System.out.printf("hello  %e \n",b);//floating point representation in +ve direction.
//        System.out.printf(" hello %g \n",b);//floating point representation in -ve direction.
        System.out.printf("1$d,2$c",a,c);

    }
}
