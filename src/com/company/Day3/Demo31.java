package com.company.Day3;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Demo31 {
    public static void main(String[] args) {
        //try block to check for exceptions
        try (FileOutputStream stream = new FileOutputStream("src/com/company/Day3/Data.txt")) // creating a FileOutputStream object to be used as a resource
         {
             //custom string input
             String data = "Hello World";
             //convert string to bytes
             byte[] arr = data.getBytes();
             //text is written to the file
             stream.write(arr);

        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("resources are closed ");
    }
}
