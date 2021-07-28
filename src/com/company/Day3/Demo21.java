package com.company.Day3;

class DuplicateLoginExeception extends Exception{

}

class Authentication {
    private boolean isLoggedIn = false;

    public void logIn(String email, String password) throws DuplicateLoginExeception {
        if(!isLoggedIn){
            if(email.equals("admin") && password.equals("123")){
                isLoggedIn = true;
                System.out.println("Login successful");
            }else{
                System.out.println("Login failed! Please try again");
            }
        }else{
            throw new DuplicateLoginExeception();
        }
    }
}

public class Demo21 {
    public static void main(String[] args) {
        Authentication auth = new Authentication();
        try {
            auth.logIn("admin", "123");
        } catch (DuplicateLoginExeception e) {
            e.printStackTrace();
        }

        try {
            auth.logIn("admin", "123");
        } catch (DuplicateLoginExeception e) {
           // e.printStackTrace();
            System.out.println("Hey! You're already logged in");
        }


    }
}
