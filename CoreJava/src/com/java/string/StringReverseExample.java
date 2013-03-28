package com.java.string;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StringReverseExample {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        //original string
        String str = "Sony is going to introduce Internet TV soon";
        System.out.println("Original String: " + str);

        //reversed string using Stringbuffer
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);

    }
}
