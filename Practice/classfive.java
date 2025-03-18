package Practice;



public class classfive {
    public static void main(String args []){
        // operator's in java 
        /*         *** type of Operator's*** 
        * Arithmetic Operator's  : + ,  - , * , / , % 
         * Relational Operator's : >= ,  <= , > ,  < ,  == , !=
         * Logical Operator's  : &&Logical And , ||Logical Or ,  !Logical Not
         * Bitwise Operator's  :  << ,  >> ,  >>> ,  ~ , ! ,  & ,  ^ 
         * Incre Decrement Operator's  = ++ --  
         * Asign Operator's  = , == , += , *= , -= , /= , %= 
         */

         /* Arithmetic Operator's  */
         int a = 5 ;
         int b = 10  ;
         int sum = a + b ;
         int decre = a - b ;
         int multi = a * b ;
         int devie = a / b ;
         int modul = a % b ;
         System.out.println( "sum" + sum );
         System.out.println( "decrement" + decre );
         System.out.println( "multiply of value " + multi);
         System.out.println("dievide of valu" + devie);
         System.out.println( "modulo of vlaue " +  modul);


         /* Relational Operator's  */
          boolean check = a > b ; // false
          check = a < b ; // true  
          check = a >= b ; // false
          check = a <= b ; // true
          check = a == b ; // false
          check = a != b ; // true 
          System.out.println(check);


          /* Logical Operator's  */
         boolean anothorecheck = a < b && a <= b ;
         anothorecheck = a < b && a > b ;
         anothorecheck = a < b || a <= b ;
         anothorecheck =  a >= b || a <= b  ;
         anothorecheck = a < b != a <= b ; 
         System.out.println(anothorecheck);


         /* Bitwise Operator's  */
         int operation = a << b ; 
         operation = a & b ;
         operation = a ^ b ;
         operation = a >> b ;
         operation = ~a ;
         operation = ~b ;
         operation = a >>> b ;
         System.out.println(operation);

        /* Increment and Decrement Operator's  */
         int addval = a ++ ;
         addval = a -- ;
         addval = b ++ ;
         addval = b -- ;
         addval = a + 1 ;
         addval = a - 1 ;
         System.out.println(addval);

         /* Asign Operator  */
         int i = a ;
         i += 5;
         i -= 2 ;
         i *= 5 ;
         i /= 4 ;
         i %= 2;
         boolean j =  i == 0;
         System.out.println(i);
         System.out.println(j);


         int g = 10 ;
         System.out.println(g ++);
         System.out.println( g );
         System.out.println( ++ g );
         System.out.println(g );

    }
}
