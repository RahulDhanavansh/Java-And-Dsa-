package Day_1.Conversion;

public class typePromotion {
    public static void main(String[] args) {
        
        /*
         Java automatically promotes each byte, short, or char operand to int when evaluating an expression. 

         For Example
         */

// char a = 'a';
// char b = 'b';
// System.out.println((int)(a)); //value of a is 97
// System.out.println((int)(b)); //value of b is 98
// System.out.println(b-a);


/*
 if one operand is long, float or double then the whole expression is promoted to long,float, or double respectively
 */


int a = 10;
float b = 20.25f;
long c = 25;
double d = 30;
double ans  = a+b+c+d;
System.out.println(ans);

//all datatype first convert into double then sum operation is happened because double is the biggest datatype
    }
}
