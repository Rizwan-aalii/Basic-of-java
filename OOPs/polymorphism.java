package OOPS;

class polymor {
    public String infocode (String name ) {
        System.out.println(name);
        return name ;
    }
    public int  infocode ( int age ) {
        System.out.println(age);
        return age;
    }
    public void infocode (String name , int age ){
        name = "rizzu" ; 
        age = 19 ; 
        System.out.println(name + age );
    }

}

public class polymorphism {
    public static void main(String[] args) {
        polymor poly = new polymor();
        poly.infocode(15);
        poly.infocode("rizzukhan");
    }
}
