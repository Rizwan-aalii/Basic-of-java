
import java.util.Scanner;
public class questonPractice {

    public static int average (int a , int b , int c ){
        int n = 50 ;
        int avg = (a + b +c)/n;
        System.out.println(avg + '%');
        return avg;
    }

    public static void EvenOrOddNumber (int a ){
        if ( a % 2 == 0 ) {
            System.out.println("your number is even " + a);
        }else{
            System.out.println("your number is odd" + a );
        }
    }
    public static boolean EligibleOrNot (boolean a , boolean b  ){
        
        int age = 19 ;
        if(age > 18){
            System.out.println(a + "your elibel to vote");
            for(int i = 1 ; i<=4; i++){
                for(int j = i ; j<=5; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println(b  + "your not eligible for vote ");
        }
        return a ;
    }

    public static void GreatorNumber (int a , int b ){
        if ( a > b ){
            System.out.println( a + "greator then " + b );
        } else {
            System.out.println(a  + "less then " + b );
        }
    }

    public static void main (String args []){

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        GreatorNumber(a , b );

        boolean age = EligibleOrNot(true , false);
        
        
        EvenOrOddNumber(a);
        


       





    }
}
