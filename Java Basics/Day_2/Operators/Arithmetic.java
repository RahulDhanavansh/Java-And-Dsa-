package Day_2.Operators;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("Arithmetic operations");

        /*
         * There are two types of Arithmetic operations
         * 1. Binary
         * 2. Unary
         */
        // Binary Operators :- when two operands were used in a expression

        // int a = 10;
        // int b = 5;
        // int sum = a + b;
        // System.out.println(sum);

        /*
         * Unary operators :- Single operand in a expression
         * 
         * ex = a++(a=a+1), ++a, a--, --a
         * ++ is called Increment Operator
         * -- is called decrement operator
         * 
         * Tncrement are also of two type
         * 1. Pre-Increment
         * 2. Post-Incrremen
         * 
         */

        // Pre-Increment :- first value were change and then value were used

        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        int e = 10;
        int f = --e;
        System.out.println(e);
        System.out.println(f);

        // Post-Increment :- first value is change then value is increse

        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        /*
         in this expression value of c is assign as 10 then the value is used for 10 
         so value of d is also 10 then it increases so the value of c is increses to 11
         */

        int g = 10;
        int h = g--;
        System.out.println(g);
        System.out.println(h);

    }

}
