package alllecture;

public class classfour {

    // Function in Java 
    public static void printName (String name ){
        System.out.println(name);
        return;
    }
    public static int sumTwoValue (int a , int b ){
        int sum = a + b ; 
        return sum ;          
    }
    public static int multNumber (int a , int b ){
        int mul = a * b ;
        return mul; 
    }
    
    public static void main( String args [] ) {
        String name = "tony stark ";
        printName(name);

        int a = 10; 
        int b = 15;
        int output = sumTwoValue(120 , 10);
        System.out.println(output);
        
        int mul = multNumber(a, b);
        System.out.println(mul);



















    }
}
