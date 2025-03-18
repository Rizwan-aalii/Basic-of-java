package alllecture;
import java.util.Scanner;

public class classsix {
    // Arrys in Java 
    public static void main (String args []){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int size = scanner.nextInt(); // this take size of array 
        scanner.nextLine(); // Consume the newline character after nextInt()

        // Step 2: Declare string array
        String[] words = new String[size]; // this code asign size to array ;

        // Step 3: Take array input
        System.out.println("Enter " + size + " strings:");
        for (int i = 0; i < size; i++) {
            System.out.print("String " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }

        // Step 4: Display the array
        System.out.println("\nThe entered strings are:");
        for (String word : words) {
            System.out.println(word);
        }
        // Close scanner
        // dont understand this 

        int num [] = {10,12,14,15};
        for(int p = 0 ; p<4; p++){
            System.out.println(num[p]);
        }
        int mark = scanner.nextInt();
        int marks [] = new int[mark];
        for(int k = 0 ; k<mark; k++){
            marks[k] = scanner.nextInt();
        }
        for(int l = 0; l<marks.length ; l++){
            System.out.println(marks[l]);
        }
        
        
       
    }
}








