package com.company.Day4;

import java.util.HashMap;
import java.util.Map;

public class LoginHashMap {
    public static void main(String[] args) {

        //1. Write a Java program to associate the specified value with the specified key in a HashMap
        Map<String, Integer> login = new HashMap();
        login.put("User", 0000);
        login.put("admin", 1111);
        login.put("John", 1234);
        login.put("Mark", 4512);
        login.put("Judi", 6852);

        System.out.println(login);

        //2. Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println(login.size());

        //3. Write a Java program to copy all of the mappings from the specified map to another map.
        Map<String, Integer> newLogin = new HashMap<>();

        newLogin.putAll(login);
        System.out.println(newLogin);


    }
}
