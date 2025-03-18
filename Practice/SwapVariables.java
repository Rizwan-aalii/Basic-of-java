package Practice;

public class SwapVariables {
    public static void main(String[] args) {
        int a = 5, b = 10;
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        a = a + b;   // a = 5 b = 10 : a+b  5+10 = 15 
        b = a - b;   // a = 15 b = 10 : a-b 15-10 = 5
        a = a - b;   // a = 15 b = 5 : a-b  15-5 = 10 
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
