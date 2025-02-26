package alllecture;
import java.util.*;
class classone {
    public static void main(String[] args) {
        // output in java 
        System.out.print("Hello, World 1!");
        System.out.print("Hello, World3!\n");
        System.out.println("Hello, World 2!");
        System.err.print("hirizzu \n kaisi ho tum \n  ");  // three type to print value 
        /* Q1. print stars *
                            ** 
                            ***
                            ans.  */ 
        System.out.print("*\n** \n***\n");

        // variable' s in java 
        @SuppressWarnings("unused") // to remove warning
        // string type data type 
        String  name  = "  tony stark ";
        System.out.println("Integer total Max value : " + Integer.MAX_VALUE);
        System.out.println("Integer total Min value : " + Integer.MIN_VALUE);
        System.out.println("Integer total Min value : " + Byte.MIN_VALUE);
        System.out.println("Integer total Max value : " + Byte.MAX_VALUE);
        System.out.println("Long total Max value : " + Long.MAX_VALUE);
        System.out.println("Long total Min value : " + Long.MIN_VALUE);
        System.out.println("Short total Max value : " + Short.MAX_VALUE);
        System.out.println("Short total Min value : " + Short.MIN_VALUE);
        System.out.println( "Max value of Float : " + Float.MAX_VALUE);
        System.out.println( "Max value of Float : " + Float.MIN_VALUE);
        System.out.println( "Max value of Double : " + Double.MAX_VALUE);
        System.out.println( "Max value of Double : " + Double.MIN_VALUE);
        // double type data type 
        Double price = 100000.00 ;
        // number type data type int 
        int age = 25 ;
        // print the value age and name 
        System.out.println(age);
        System.out.println(name );

        // changing a value of name 
        name = "steve rogher ";
        System.out.println(name );
        // print value of name with checking change or not 
        String add = name + name ;
        System.out.println(add);
        int a = 10 ;
        int b  = 5 ;
        int ans = a * b / a - b ;
        int ns = (a * b ) / (a - b );
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b ;
        b = a - b ;
        a = a - b ; 
        System.out.println("After swapping: a = " + a + ", b = " + b);

        System.out.println(ans);
        System.out.println(ns);
        

        // input in java 
        Scanner sc = new Scanner(System.in); 
        // String school = sc.next();
        // System.out.println(school);
        // String college = sc.nextLine();   // for string value
        // Integer college = sc.nextInt();   // for number value 
        // float college = sc.nextFloat();      // for float value      
        // System.out.println(college);
        int f = sc.nextInt();
        int e = sc.nextInt();
        int sum = f + e ; 
        System.out.println(sum);

         
        
    }
}