package DSA.strings;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.SortedMap;

public class StringBasics {
    public static void main(String[] args) {
        String str = "manojkumar";
        //length of the string
        System.out.println(str.length());
        System.out.println("----------------------");

        //finding the char at specified index
        System.out.println(str.charAt(2));
        System.out.println("----------------------");

        //extracting the substring from the string
        System.out.println(str.substring(2));
        System.out.println("----------------------");
        System.out.println(str.substring(0,5));
        System.out.println("----------------------");

        System.out.println( str.replace("k", "m"));
        System.out.println("----------------------");

        String str1 = "MANOJKUMAR";
        System.out.println(str.toUpperCase());
        System.out.println("----------------------");

        System.out.println(str1.toLowerCase());

        //Remove leading and trailing whitespace. using trim
        String str2 = " manoj HEllo ";
        System.out.println(str2.trim());
        System.out.println("-----------------------------");

        String str3 = "java";
        System.out.println(String.join(", ", "python", "ruby"));
        System.out.println("-------------------------------");




    }
}
