public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Switch");

        /*
         * Syntax
         * switch (variable){
         * case1 :
         * 
         * cas2:
         * 
         * case3:
         * 
         * default :
         * }
         */
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("mango shake");
                break;
            default:
                System.out.println("Sapna tha bhai");
                break;
        }

    }

}
