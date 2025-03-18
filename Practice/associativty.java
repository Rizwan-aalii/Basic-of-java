package Practice;
public class associativty {
 public static void main (String args []){
    int a = 10 ;
    int b = 15 ;
    int clc = a+b +2 + a + b + b *b ;
     clc = a*b -a + a/b;
     /* a*b -a + a/b 
       10 * 15 - 10 + 10 / 15
      150 -10 + 10 / 15 
      150- 10 +0
      150 -10
      140 
      
      */
    System.out.println(clc);
    
 }
}