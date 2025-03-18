package Practice;



public class loops {
    public static void main ( String args [] ) {
        

        // for loop in java 

        // for(int i = 1 ; i<=4; i++) {
        //     System.out.println("hello world");
        // }
        // int m = 2 ; 
        // for(int i = 1; i<=10; i++){
        //    System.out.println(m*i);
        // }

        // int j = 1;
        // while(j<=10){
        //     System.out.println("hi");
        //     j++;
        // }

        // int k = 1;
        // do{
        //     System.out.println("bawli gand");
        //     k++;
        // }while(k<=1);

        // int a = 1;
        // do{
        //     System.out.println('a');
        //     a++;
        // }while(a<=1);
        
        // int b = 1;
        // while (b<=1) {
        //     System.out.println('b');
        //     b++;
        // };

        // for(int c = 1 ; c<=5; c++) {
        //     System.out.println('c');
        // };

        // int d = 2;
        // while (d <=1) {
        //     System.out.println('d');
        //     d++;
        // };

        // int e = 2 ;
        // do{
        //     System.out.println('e');
        //     e++;
        // }while(e<=1);

        
       
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if (age > 18) {
        //     for(int i=0;i<=5;i++){
        //         System.out.println("hi you now 18+ ");
        //     }
        // }
        // else{
        //     System.out.println("you are not adult");
        // }
        int n = 4;
    	
    	     for(int i = 0; i<=n ; i++ ){
    	        for(int j = 1; j<=i ; j++){
    	            System.out.print("*");
    	        }
    	        for(int j = 1; j<=2*(n-i); j++){
        	            System.out.print(" ");
        	        }
        	        for(int j = 1; j<=i ; j++){
        	            System.out.print("*");
        	        }
        	        System.out.println(); 
        	     }

    }


    
}
