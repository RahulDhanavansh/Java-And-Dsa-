import java.util.*;

public class evenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number :");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("it is Even");
        } else {
            System.out.println("it is Odd");
        }
        sc.close();
    }

}
