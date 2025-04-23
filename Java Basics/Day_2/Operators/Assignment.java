package Day_2.Operators;

public class Assignment {
    public static void main(String[] args) {
        System.out.println("Assignment Operators");

        /*
         * "=" assign value(a=2) 
         * "+=" increase value(a = a+10 or a+=10 = 20)
         * "-=" for decreasing(a = a-10 or a-=10 = 0)
         * "*=" for multiply (a = a*10 or a*=10 is 100)
         */

        int a = 10;
        int b = a += 10;
        System.out.println(a);
        System.out.println(b);

        int c = 10;
        int d = c -= 10;
        System.out.println(c);
        System.out.println(d);

        int e = 10;
        int f = e *= 10;
        System.out.println(e);
        System.out.println(f);

    }

}
