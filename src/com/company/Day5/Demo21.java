package com.company.Day5;

import java.io.FileWriter;
import java.io.IOException;

public class Demo21 {
    public static void main(String[] args) throws IOException {
        // it will first check if we have a file by this name
        // then it will create a new file if we do not have the file
        FileWriter fw = new FileWriter("data2.txt", true);
        fw.write(10);
        fw.write(157);  // single character
        fw.write("This is a message7548724");
        fw.write("\n");;
        char[] c1 = { 'a', 'b', 'c' };
        fw.write(c1);
        fw.write("\n");

        fw.flush();
        fw.close();
    }
}
