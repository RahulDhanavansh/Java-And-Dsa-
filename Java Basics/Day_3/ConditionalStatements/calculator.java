import java.util.Scanner;

import Day_2.Operators.operators;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int a = sc.nextInt();
        System.out.println("Enter number : ");
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        char Operator = sc.next().charAt(0);

        switch (Operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;

            default:
                System.out.println("wrong operator");
                break;
        }

        sc.close();
    }

}
