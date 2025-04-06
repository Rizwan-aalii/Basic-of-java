package alllecture;

import java.util.Scanner;
public class class10 {
    public static void main(String[] args) {
        // Operator in Java 
       int age = 19 ;
       String gender = "male";
       String male = "male";
       if(age >= 18 && gender == male) {
        System.out.println("Logical and " +true);
       }else {
        System.out.println("Logical and " +false);
       }
       if(age >= 18 || gender == male) {
        System.out.println("Logical or " +true);
       }else {
        System.out.println("Logical or " +false);
       }
       if(!(age >= 18)) {
        System.out.println("Not Logical or " + true);
       }else {
        System.out.println("Not Logical or " +false);
       }



    }
}




