package com.company.Day3;

public class Demo22 {
    public static void main(String[] args) {
        //Case 1: Exception does not occur
        try{
            int c = 10 / 5;
            System.out.println(c);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Case 1: finally is called");
        }

        //Case 2: Exception occurs but is not handled
        try{
            int c = 20 / 0;
            System.out.println(c);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Case 2: finally is called");
        }

        //Case 3: Exception occurs and is handled
        try{
            int c = 10 / 0;
            System.out.println(c);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Case 3: finally is called");
        }
    }
}
