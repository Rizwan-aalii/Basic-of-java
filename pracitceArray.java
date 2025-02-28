import java.util.*;
public class pracitceArray {
    public static void main (String args []){
        // Scanner in = new Scanner(System.in);
        // int size = in.nextInt();

        // Q 1./
        /*int number [] = new int [size];
        
        for(int i = 0 ; i<size; i++ ){
            number[i] = in.nextInt();
        }
        System.out.println("enter min value ");
        int minimval = in.nextInt();
        System.out.println("enter max value ");
        int maxval = in.nextInt();
        for(int i = 0; i<size; i++){
            
            if (number[i] == minimval) {
                System.out.println(number[i]);
            }
            if (number[i] == maxval) {
                System.out.println(number[i]);
            }
        } */

        // Q 2./ 
        /*int number [] = new int [size];
        for(int i = 0 ; i<size ; i++){
            number[i] = in.nextInt();
        };
        for(int i =  0 ; i<size; i++){
            System.out.print(number[i]);
        } */
        
        // Q 3./
    
        /*int number [] = new int[size];
        for(int i =  0 ; i<size; i++){
            number [i] = in.nextInt();
        }
        for(int i = 0 ; i<size; i++){
            if (number[i] % 2 ==0 ) {
                System.out.println("Number are even ");
                break;
            }else {
                System.out.println("Number are odd");
                break;
            }
        } */

        // Q 4./ 
        // int number [] = new int[size];
        // for(int i =  0 ; i<size; i++){
        //     number [i] = in.nextInt();
        // }
        // int x = in.nextInt();
        // for(int i  = 0; i<size ; i++){
        //     if (number[i] == x ) {
        //         System.out.println(number[i]);
        //     }
        // }

        int num = 10;
        while (num % 3 != 0) {
            System.out.print(num + " ");
            num--;
        }


    }
}
