
public class if_else {
    public static void main(String[] args) {
        System.out.println("IF-ELSE");

        /*
         * SYNTAX
         * if(condition){
         * 
         * }
         * else{
         * 
         * }
         */

        int age = 15;

        if (age >= 18) {
            System.out.println("You can vote ,drive ,drink");
        }
        if (age > 13 && age < 18) {
            System.out.println("You are a teenager");
        }

        else {
            System.out.println("You can not vote");
        }

    }
}