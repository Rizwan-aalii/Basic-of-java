package Practice;

import java.util.Scanner;

public class practiceFn {
    
    public static int FactorialOfNum(int fact) {
        if (fact == 0) {
            return 1;
        } else {
            return fact * FactorialOfNum(fact - 1);
        }
    }

    public static int Add(int a, int b, int c) {
        return a + b + c;
    }

    public static int Add(int a, int b) {
        return a + b;
    }

    public static void EvenOrOdd (int a  ){
        if(a % 2 == 0){
            System.out.println("your number is even " + a  );
        }else{
            System.out.println("your number is odd " + a    );
        }
    }

    public static int NumberPercentage(int a, int b, int c, int d, int e) {
        int totalVal = a + b + c + d + e;  
        int percentage = (a * 100) / totalVal;  
        System.out.println("Your Percentage" + percentage);
        return percentage; 
    }
    
    public static void main(String args[]) {

        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int Maths = in.nextInt();
        int Physics = in.nextInt();
        int Chemistry = in.nextInt();
        int ComputerScience = in.nextInt();
        int DataStructureAlgoritham = in.nextInt();
        NumberPercentage(Maths , Physics , Chemistry , ComputerScience , DataStructureAlgoritham);

        int x = 5;
        if (x > 3) {
            System.out.println("Hello");
        } else {
            System.out.println("World");
        }
        

        // finally example
     try {
             System.out.println(10 / 2);
    } catch (Exception e) {
              System.out.println("Error!");
    } finally {
              System.out.println("This will always execute.");
    }
        EvenOrOdd(15 );
        int fact = FactorialOfNum(0);
        System.out.println("your factorial num " + fact);
        
        int num2 = Add(10, 15, 20);
        int num1 = Add(10, 15);
        System.out.println(num1);
        System.out.println(num2);
    }
}

