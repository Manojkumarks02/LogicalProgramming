package DSA.strings;

import java.util.Arrays;

public class StringBufferBasics {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("manoj");

        //appending: adding the string to existing string
        stringBuffer.append("kumar");
        stringBuffer.append(1);
        stringBuffer.append(true);
        System.out.println(stringBuffer);
        System.out.println("------------------");

        //Insert a string at a specific index

        stringBuffer.insert(2, "m");
        System.out.println(stringBuffer);
        System.out.println("--------------------------");

        //Delete: Delete characters from the buffer.

        System.out.println(stringBuffer.delete(0,4));
        System.out.println("----------------------------");

        //Reverse: Reverse the characters in the buffer.
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        System.out.println("--------------------------");

        //Replace: Replace a part of the string with another string.
        stringBuffer.replace(0,3, "java");
        System.out.println(stringBuffer);
        System.out.println("---------------------------");

        //Capacity: Get the current capacity of the buffer.
        System.out.println(stringBuffer.capacity());
        System.out.println("------------------------------");

        //EnsureCapacity: Ensure that the capacity is at least a certain value.
        stringBuffer.ensureCapacity(50);
        System.out.println(stringBuffer.capacity());

        //SetCharAt: Set a character at a specific index.
        StringBuffer stringBuffer1 = new StringBuffer("hello world");
        stringBuffer1.setCharAt(2, 'm');
        System.out.println(stringBuffer1);
        System.out.println("-------------------------------");

        //Substring: Extract a substring.
        System.out.println(stringBuffer1.substring(2));
        System.out.println("---------------------------------");

        //GetChars: Copy characters from the buffer to an array.
        char[] ch = new char[4];
        stringBuffer1.getChars(0,4,ch,0);
        System.out.println(Arrays.toString(ch));


    }
}

