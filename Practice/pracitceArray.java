package Practice;
// import java.util.*;
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

        // int numl = 10;
        // while (numl % 3 != 0) {
        //     System.out.print(numl + " ");
        //     numl--;
        // }

        int arr[] = {1,2,3,4,5};
        int start = 0; // this is forward treverse on arr 
        int end = arr.length - 1 ; // this is for backward treverse on arr
        while (start < end) {
            //  swape the element 
            int temp = arr[start]; // this is the 0At Index of arr 
            arr[start] = arr[end]; // this perform end Index asign in to Start Index that mean 1 to 4 
            arr[end] = temp ;

            // update the Index of Start and End 
            start ++ ;  // beacuse of this start with 0 the 1+1 2 2+1 3 3+1 4 
            end -- ; // this case is 4-1 - 3 3-1 - 2 2-1 - 1-1 - 0 
        }
        for(int num : arr){
            System.out.print(num + " ");
        }

        System.out.println();
        int arr1 [] = {10,20,30,40,50,60};
        int begin = 0 ;
        int last = arr1.length -1;
         
            while (begin < last) {
                //  swape the element 
                int solu = arr1[begin];
               arr1[begin] = arr1[last] ;
               arr1[last] = solu;
    
                // update the Index of Start and End 
                begin ++ ;  // beacuse of this start with 0 the 1+1 2 2+1 3 3+1 4 
                last -- ; // this case is 4-1 - 3 3-1 - 2 2-1 - 1-1 - 0 
            }
            for(int num1 : arr1){
                System.out.print(num1 + " ");
            }
       
        /* how this work explain 
         

arr = [1, 2, 3, 4, 5]
start = 0  (points to 1)
end = 4    (points to 5)



         */


    }
}
