package Practice;
import java.util.Scanner;
public class practiceOfArr {

    public static void main(String args []){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("how much lenth you want in to array ");
            int size = in.nextInt();
            System.out.println("inter your value in array ");
            int value [] = new int[size];
            for(int i = 0 ; i<value.length;i++){
                value [i] = in.nextInt();
            }
            // that is foreach loop 
            System.out.println("here are your value output ");
            for(int i : value){
                System.out.println(i);
            }
        }

        // System.out.println("How much want to print ");
        // String [] MarvelHero = new String[size]; // this is our array value 
        // System.out.println("Enter your Hero's "); 
        // for(int i = 0;i<size;i++){
        //     MarvelHero [i] = in.nextLine(); // this line mean what kind of array type we want 
        // }
        // for(int i = 0; i<MarvelHero.length;i++){
        //     System.out.println(MarvelHero[i]);
        // }
        // char [] charArray = {'a' , '9' , 'b' , 'd'};
        // System.out.println(charArray);

        // String month = "Ramzan";
        // System.out.println(month.charAt(0));

        int jaggadArry [] [] = new int [2] [3];
       jaggadArry [0] =new int[]  {10, 15, 20};
       jaggadArry[1] = new int [] {25 , 30};
        for(int i = 0; i<jaggadArry.length; i++){
            for(int j = 0 ; j<jaggadArry.length; j++){
                System.out.print(jaggadArry[i][j] + " ");
            }
            System.out.println();
        }
        
    


    }
}