package alllecture;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int row = input.nextInt();
        int colum = input.nextInt();

        int number [] [] = new int [row] [colum];

        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<colum ; j++){
                number [i][j] = input.nextInt();
            }
        }

        for(int i = 0 ; i<row ; i++ ){
            for(int j = 0 ; j<colum ; j++){
                System.out.print(number[i] [j]);
            }
            System.out.println();
        }
    
    
    }
}