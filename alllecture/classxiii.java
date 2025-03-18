package alllecture;

public class classxiii {
    public static void main(String[] args) {

        // String in Java 

        String firstName = "Rizwan" ; 
        String lastName = "Sheikh";
        String fullName = firstName + " " + lastName ;
        System.out.println(fullName);
        System.out.println(fullName.length());
        for(int i = 0 ; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
        String Str1 = "hello world" ;
        String str2 = "hello world" ;
        System.out.println(Str1 == str2);
        if(Str1.compareTo(str2)==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        // beacuse they both have new memory location here we compare the location of the string 
        if(new String("tony") == new String("tony")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        // sub String 
        // take a small part from big string 
        String sentence = "my name is tony stark ";
        String name = sentence.substring(11);
        System.out.println(name);
    }
    
}
