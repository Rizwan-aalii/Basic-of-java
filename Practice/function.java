package Practice;
import java.util.Scanner;


public class function {

    public static String MyName (String  cost ){
         cost = "ok ";       
        return cost ;
    }
    public static int AddNum (int a , int b ){
        int sum = a + b ; 
        System.out.println(sum);
        return sum ;
    }

    public static void SayHello (String greeting) {
        System.out.println( "hello world ");
    }
    public static void HiBoy (String Welcome){
        SayHello(Welcome);
    }

    public static double GroseryItems (double tameto  ){
        tameto = 10.10;
        double pateto = 60.00;
        double watermilon = 50.00;
        System.out.println(tameto + pateto + watermilon);
        return tameto + pateto + watermilon ;
    }

    public static void MultiplyNum (int a , int b ){
        
    }
    public static float AmoutOfProduct (float elbyMustag , float bugattiChiron, float keonegssegJeskoAbsulate  ){
        return keonegssegJeskoAbsulate + bugattiChiron + elbyMustag;
    }
    public static void CarsName (String Cars){
        System.out.println(Cars);
    }
    public static void main (String args []){
        float value =  AmoutOfProduct(100.00f, 300.00f, 250.00f);
        System.out.println(value);
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        String Cars = in.nextLine();
        CarsName(Cars);
        GroseryItems(10.0);
        HiBoy(Cars);
         
        MultiplyNum(12,11); 
             
    }

}

// let myname function (a , b ){
//     sum = a + b 
//     console.log(sum)
//     return 
// }
// myname(10 , 12)