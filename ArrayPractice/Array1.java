package ArrayPractice;
import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Array Size");
        int size = in.nextInt();
        int Myarray [] = new int[size];
        System.out.println("Enter Your Array Value's ");
        for(int i =0; i<size ; i++){
            Myarray [i] = in.nextInt();
        }
        System.out.println("That Your value Output");
        for(int valu : Myarray){
            System.out.print(valu + " ");
        }
        System.out.println("Reverse Array ");
        for(int i=0; i<size/2; i++) {
            int temp = Myarray[i];
            Myarray[i] = Myarray[size - 1 - i];
            Myarray[size - 1 - i] = temp;
            System.out.println(Myarray[i]);
        }

        int Array [] = {10,12,13,14,15};
        int n = Array.length;
        System.out.println("Array Is print ");
        System.out.println(Arrays.toString(Array));
        System.out.println("after REverse ");
        for(int i = 0 ; i<n /2 ; i++) {
            int temp = Array[i];
            Array[i] = Array[n-1-i];
            Array[n-1-i] = temp;
        }
        System.out.println(Arrays.toString(Array));
        

        
    }
}
