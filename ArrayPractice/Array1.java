package ArrayPractice;
import java.util.*;

class InputWithArray {
    public void  InputArray () {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter Your Array Size ");
      int size = sc.nextInt();
     int Arru [] = new int[size];
    System.out.println("Enter your Array Value ");
     for(int i = 0 ; i<size ; i++){
        Arru [i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(Arru));
    for(int i = 0 ; i<Arru.length / 2 ; i++){
        int temp = Arru[i];
        Arru[i] = Arru[Arru.length - 1 - i];
        Arru[Arru.length - 1 - i] = temp;
    }
    System.out.println(Arrays.toString(Arru));


    }

   


}
class Array2 {
     public void MyArray () {
        int Arraysa [] = {11,12,15,16,18,19};
        System.out.println(Arrays.toString(Arraysa));
        for(int i = 0 ; i<Arraysa.length / 2 ; i++){
            int temp = Arraysa[i];
            Arraysa[i] = Arraysa[Arraysa.length - 1 - i];
            Arraysa[Arraysa.length - 1 -i ] = temp ;
        }
        System.out.println(Arrays.toString(Arraysa));
        
    }
}

class animal {
    String directorName = "Sandeep Reddy Wanga" ;
    

}

class AnimalPark extends animal {
    public void animul () {
        System.out.println(directorName);
    }
}

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
        
        System.out.println( "Array Length " + Array.length / 2 );
        System.out.println( "Array Length " + Array.length % 2 );
        Array2 arr = new Array2();
        arr.MyArray();
        InputWithArray arru = new InputWithArray();
        arru.InputArray();

        
        

        AnimalPark ani = new AnimalPark() ;
        ani.animul();
        



        


    }

}
