package Day_2.Operators;

public class Logical {
    public static void main(String[] args) {
        System.out.println("Logical Operators");

        /*
         * 1. Logical And(&&)
         * both statement should be true
         * True and True = True
         * True and False = False
         * False and False = False
         * False and True = False
         */

        System.out.println(3 > 2 && 2 > 1);
        System.out.println(3 > 2 && 2 < 1);

        /*
         * * 1. Logical OR(||)
         * one statement should be true
         * True and True = True
         * True and False = True
         * False and False = False
         * False and True = True
         */

        // System.out.println(3 > 2 || 4 < 2);
        // System.out.println(3 < 2 || 2 < 1);

        /*
         * 1. Logical NOT(!)
         * Tue into False
         * False into t=True
         */

        System.out.println(!(3 > 2));
        System.out.println(!(0 > 5));

    }

}
