package alllecture;

import java.lang.classfile.instruction.NewMultiArrayInstruction;

public class classix {
    public static void main(String[] args) {
        // String Builder 

        StringBuilder Name = new StringBuilder("Tony Stark");
        System.out.println(Name);
        System.out.println(Name.charAt(5));
        // set charAt
        Name.setCharAt(5, 'M');
        System.out.println(Name);
        // insert charAt
        Name.insert(5, 'J');
        System.out.println(Name);
        // delete charAt 
        Name.delete(5, 6);
        System.out.println(Name);
        // Append charAt 
        StringBuilder greeting = new StringBuilder("h");
        greeting.append('e');
        greeting.append('l');
        greeting.append('l');
        greeting.append('o');
        System.out.println(greeting);
        System.out.println(greeting.length());
    }
}
