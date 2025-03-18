package alllecture;

import java.util.*;
public class classsecond 
{

    public static void main (String args [] ) {

    // condition statment 

     @SuppressWarnings("resource")
     Scanner sci = new Scanner(System.in);
     int age = sci.nextInt();
     if (age > 18 ) {
        System.out.println("behan ke lund adult hai tu ");        
     }
     else {
        System.out.println("choti baachi ho bhi tum ");
     }

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a % 2 == 0){
        System.out.println("your number is true ");
    } else {
        System.out.println("your number is false " + a );
    }


    /*
     * check the value of aa and b equal that print equal value big print big 
     * value small print small 
     */
    @SuppressWarnings("resource")
    Scanner scp = new Scanner(System.in);
    int aa = scp.nextInt();
    sc.nextLine();
    int b = sc.nextInt();
    
    if (aa == b ) {
        System.out.print("the value is equal ");
    } else if ( a > b ) {
        System.out.println( a + "is the big then to " + b );
    } else {
        System.out.println(a + "is the chota hai  then" + b);
    }
 
    //

    if (a == 1 ) {
        System.out.print("hello");
    }
    else if (a == 2) {
        System.out.print("namste");
    }
     else if (a == 3 ) {
        System.out.print("salam");
    }
     else {
        System.out.print("invalid button ");
    }

    // switch in java 
    switch (a ) {
        case 1 : System.out.println("al-Muḥarram");  
        break ;
        case 2 : System.out.println("Ṣafar");
        break;
        case 3 : System.out.println("Rabīʿ al-ʾAwwal");
        break;
        case 4 : System.out.println("Rabīʿ al-ʾĀkhir");  
        break ;
        case 5 : System.out.println("Jumādā al-ʾŪlā");
        break;
        case 6 : System.out.println("Jumādā al-ʾĀkhirah");
        break;
        case 7 : System.out.println("Rajab");  
        break ;
        case 8 : System.out.println("Shaʿbān");
        break;
        case 9 : System.out.println("Ramaḍān");
        break;
        case 10 : System.out.println("Shawwāl");  
        break ;
        case 11 : System.out.println("Ḏū al-Qaʿdah");
        break;
        case 12 : System.out.println("Ḏū al-Ḥijjah");
        break;
        default : System.out.println("sorry your enter 0 or 13 or more then 12 number"); ;
    }
    /*
     * in switch case we use condition and condition value 
     * in this code a take input to user as number then match 
     * if user enter 1 then print muharram or 2 print safar 
     * and so on that it  number by month 
     */


    }
    
}