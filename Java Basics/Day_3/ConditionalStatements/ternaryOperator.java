public class ternaryOperator {
    public static void main(String[] args) {
        System.out.println("Ternary Operator");
        /*
         * Syntax
         * variable = condition? statement1 : statement2;
         */

        int number = 4;

        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);

        int marks = 67;

        String exam = (marks >= 33) ? "pass" : "fail";
        System.out.println(exam);
    }
}
