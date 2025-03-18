package Practice;
import java.util.*;

public class calc {
    

    public static void main ( String args []) {



      @SuppressWarnings("resource")
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


        int month = input.nextInt();
        switch (month) {
            case 1:
                System.out.println("Muhaarmul Haram ");
                break;
            case 2 : 
            System.out.println("Jamadeel Aval ");
            break; 
            case 3 : 
            System.out.println("jamadeel AKhir ");
            break;        
            default:System.out.println("enter valid number");
        };

       
       

        
    
    












    }
}
