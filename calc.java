
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

        String Sport = "fourmula 1 ";
        switch (Sport) {
            case "fourmula 1 ":
            System.out.println("Lewis Hamilton , Max Versthempen , Charles Leclere ");                
                break;
             case "cricket":
             System.out.println("Virat Kohli , Rohit Sharma , Ben Stock , Steven Smith ");
             break;
             case "football" : 
             System.out.println("Cristiano Ronaldo , Luro Messi , Neymar Jr , Cilian Mbaape , Mesult Ozil");
             break;
             case "wwe" : 
             System.out.println("Roman Reigs , Undertaker , Brock Lesner , Randi Oraten ");
            default:
        };
    
    












    }
}
