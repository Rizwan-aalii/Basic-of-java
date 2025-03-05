import java.util.Scanner;
public class practiceOfArr {

    public static void main(String args []){
        Scanner in = new Scanner(System.in); // this line mean scanner object 
        int size = in.nextInt(); // this is a number input we want 
        in.nextLine(); // this is for buffer

        System.out.println("How much want to print ");
        String [] MarvelHero = new String[size]; // this is our array value 
        System.out.println("Enter your Hero's "); 
        for(int i = 0;i<size;i++){
            MarvelHero [i] = in.nextLine(); // this line mean what kind of array type we want 
        }
        for(int i = 0; i<MarvelHero.length;i++){
            System.out.println(MarvelHero[i]);
        }
        char [] charArray = {'a' , '9' , 'b' , 'd'};
        System.out.println(charArray);

        String month = "Ramzan";
        System.out.println(month.charAt(0));
    }
}