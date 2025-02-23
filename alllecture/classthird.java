package alllecture;
import java.util.*;

public class classthird {
    public static void main( String args [] ) {

        // nasted loop in java 
        /* Q1.  *****
                *****
                *****
                *****
        */ 
        // for(int i = 0 ; i<=4 ; i++){
        //     for(int j = 0 ; j<=5 ; j++) {
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        /* Q2.
            *****
            *   *
            *   *
            *****
         */

        // for(int k =1 ; k<=4; k++){
        //     for(int g = 1; g<=5; g++){
        //         if(k == 1 || g == 1 || k == 4 || g == 5 ){
        //             System.out.print('*');
        //         } else{
        //             System.out.print(" ");
        //         }
        //     }

        //     System.out.println();
        // }

        /* Q3.
            *
            **
            ***
            ****
         */
        // for(int i = 1; i<=4;i++){
        //     for(int j = 1 ; j<=i;j++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        /* Q4.
            ****
            ***
            **
            *
         */

        // for(int i = 4; i>=1;i--){
        //     for(int j = 1 ; j<=i;j++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }
    //     int n = 4 ;
    //    for (int i = 1; i<=n;i++){
    //     for(int j = 1; j<=n-1; j++){
    //         System.out.print(" ");
    //     }
    //     for(int j= 1; j<=i;j++){
    //         System.out.print('*');
    //     }
    //     System.out.println();
    //    }

    //    int m = 5 ;
    //    for(int i = 1; i<=4; i++){
    //     for(int j = 1;j<=5; j++){
    //         System.out.print('*');
    //     }
    //     System.out.println();
    //    }

    // int n = 5 ;
    // for(int i = 1; i<=n ; i++){
    //     for(int j = 1; j<=n-i+1; j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }

    // int n = 5 ;
    // int number = 1;
    //     for(int i = 1; i <=n; i++){
    //         for(int j = 1 ; j<=i ; j++){
    //             System.out.print(number);
    //             number++;
    //         }
    // //         System.out.println();
    //     }

    // for(int i = 1; i<=n; i ++){
    //     for(int j = 0; j<=i ; j++){
    //         int sum = i+j;
    //         if(sum %2 == 0){
    //             System.out.print("1 ");
    //         }else{
    //             System.out.print("0 ");
    //         }
    //     }
    //     System.out.println();

    // }


    /*
    *      * 
    **    **
    ***  ***    
    ********
     */
    int n = 4;

     for(int i = 0; i<=n ; i++ ){
        for(int j = 1; j<=i ; j++){
            System.out.print("*");
        }
        for(int j = 1; j<=2*(n-i); j++){
            System.out.print(" ");
        }
        for(int j = 1; j<=i ; j++){
            System.out.print("*");
        }
        System.out.println(); 
     }

     for(int i = 0; i<=n ; i++ ){
        for (int j = 1; j <= n - i  ; j++) {
            System.out.print("*");
        }
        for (int j = 1; j <= 2 * (i - 1); j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= n - i ; j++) {
            System.out.print("*");
        }
        System.out.println(); 
     }





        }
}
