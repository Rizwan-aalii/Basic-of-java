package Practice;

import java.util.jar.Attributes.Name;

class coder {
    private String coderName ; 
    private int coderAge;
    private String coderCompany;

    coder ( String Name , int Age , String Company) {
        this.coderName = Name;
        this.coderAge = Age;
        this.coderCompany = Company;
    }
    

    public int getCoderAge() {
        return coderAge;
    }
    public String getCoderCompany() {
        return coderCompany;
    }
    public String getCoderName() {
        return coderName;
    }

    
}

public class practiceofOpps {
    public static void main(String[] args) {
        coder code = new coder("Sohil" , 19 , "Apple");
       int age = code.getCoderAge();
       System.out.println(age);
       String company = code.getCoderCompany() ;
       System.out.println(company);
       String name = code.getCoderName();
       System.out.println(name);
    }
}
