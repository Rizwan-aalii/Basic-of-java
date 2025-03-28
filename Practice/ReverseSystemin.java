package Practice;

import java.util.Arrays;

public class ReverseSystemin {
    

    public static void main(String[] args) {

        // Reverse a String
        String str = "namheR ludbA";
        String reversed = "";

        // Loop through the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        // Using StringBuilder 

        String str2 = "Rizwan Sheikh";
        StringBuilder sb = new StringBuilder(str2);
        System.out.println("Reversed String: " + sb.reverse());

        // Reverse an Integer
        int num = 248961, reversednum = 0;

        while (num != 0) {
            int digit = num % 10;  // Extract last digit MODULE OPERATOR 
            reversednum = reversednum * 10 + digit;  // Append it to reversed number
            num /= 10;  // Remove last digit
        }

        System.out.println("Reversed Number: " + reversednum);


        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("now n is print " + n);

        // Reverse using two-pointer approach
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i]; // temp - [1] = arr-0 // temp - 2 = arr-1 ;
            arr[i] = arr[n - i - 1]; // 1 ite 0 - [5] =  = 4 - [5]  //   1 [4] = 5-1-1 = 3 [4]  
            arr[n - i - 1] = temp; //   4[1] = temp - 1 [5,2,3,4,1] // 3[2] = temp-2  [5,4,3,2,1]
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));





    }


 
}









