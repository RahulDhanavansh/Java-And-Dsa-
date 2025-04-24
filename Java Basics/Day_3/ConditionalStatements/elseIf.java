public class elseIf {
    public static void main(String[] args) {
        System.out.println("elseIf");

        /*
         * Syntax
         * if(condition1){
         * 
         * }
         * elseIf{
         * 
         * }
         * else{
         * 
         * }
         */

        int age = 18;
        if (age >= 20) {
            System.out.println("adult");
        } else if (age >= 13 && age < 18) {
            System.out.println("tenneger");
        } else {
            System.out.println("not adult");
        }
    }
}
