package Day_1.Conversion;

public class typeConversion {

    public static void main(String[] args) {

        /*
         * Type Conversion
         * when one kind of data convert into another kind of data
         
         
         * When the Type Conversion happens
         
         * when type Compitable
         
         * destination type > source type 
          
         long b is destination
          int a is source
         
         */

        // Example

        // int a = 25;
        // long b = a; print without any error

        /*
          long a = 25;
        int b = a;
        System.out.println(b);

        facing errors because
        we can not change long data into integer data

        here is practical reason

    typeConversion.java:18: error: incompatible types: possible lossy conversion from long to int
        int b = a;
                ^
          
                the size of long is more than size of integer
         */

         /*
          Lossy Conversion
         
          when we try to store big datatype's value into small datatype

          Widely Conversion
              when we try to store small datatype's value into big datatype

         Implicit Conversion
         the coversion which is doing by java himself
         
         */
       
    }

}
