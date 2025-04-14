
package ArrayPractice;

import java.util.*;

class FirstArray {
    int array [] = {12,13,14,45,46,47,48};
    int n = array.length;

    public void printArray () {
        System.out.println(Arrays.toString(array));
    }
}

 class SecondArray extends FirstArray {
    public void ReverseArray () {
        for(int i=0 ; i<n/2 ; i++){
            int temp = array[i];
            array[i] = array[n-1-i]; 
            array[n-1-i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
 }

public class onemore {
    public static void main(String[] args) {
        SecondArray sc = new SecondArray();
        sc.printArray();
        sc.ReverseArray();
    }
}
