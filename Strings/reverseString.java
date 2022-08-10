package Strings;

import java.lang.*;
import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(" Args ");
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String a = sn.next();
        System.out.println("Enter the second string: ");

        String b = sn.next();

        System.out.println(comboString(a, b));
//        reverse(name);
//        reverse2(name);

    }
    private static void reverse(String s){
       StringBuilder k = new StringBuilder(s);
       System.out.println("reversed_string = " + k.reverse());
    }

    private static void reverse2(String s){
        char[] c = s.toCharArray();

        System.out.println("length c = " + c.length);
        String reversed_string = "";
        for (int i = c.length-1; i > -1; i--) {
            reversed_string = reversed_string + c[i];
        }
        System.out.println("reversed_string = " + reversed_string);
    }

    private static String comboString(String a, String b){

        if (a.length() > b.length()){
            return (b + a + b);
        }else if(b.length() > a.length()){
            return (a + b + a);
        }else {
           return ("The strings are of equal lengths");
        }

    }


}
