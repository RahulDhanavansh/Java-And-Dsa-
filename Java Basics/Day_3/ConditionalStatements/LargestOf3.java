import java.util.*;

public class LargestOf3 {
    public static void main(String[] args) {
        System.out.println("larget of 3");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter the number3 :");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + "is the largest of 3");
        }

        else if (num2 > num1 && num2 > num3) {
            System.out.println(num1 + "is the largest of 3");
        }

        else {
            System.out.println(num3 + "is the largest of 3");
        }

        sc.close();
    }
}
