package Day_1;

import java.util.*;


public class input {
    public static void main(String[] args) {
        // for taking input we create a object called Scanner class

        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        // if we try to store rahul swami then it only give output as Rahul it will not
        // store the space and swami word

        // For store spaces we use new line

        // String name = sc.nextLine();
        // System.out.println(name);

        // For integer
        int number = sc.nextInt();
        System.out.println(number);

        // For floating value
        float num =  sc.nextFloat();
        System.out.println(num);

        sc.close();
        // to prevent from leaks

        
    }
}
