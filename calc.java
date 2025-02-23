
import java.util.*;

public class calc {
    

    public static void main ( String args []) {



     Scanner input = new Scanner(System.in);
     int a = input.nextInt();
     int operator =input.next().charAt(0);
     int b = input.nextInt();
     
     
     switch (operator ) {
        case  '+' : System.out.println(a + b );  
            break;
        case  '-' : System.out.println(a - b);   
        break ;
        case '*' : System.out.println(a * b ); 
        break ;
        case '/' : System.out.println(a / b); 
        break ;   
        default: System.out.println("fill the value ");
    }
    












    }
}
