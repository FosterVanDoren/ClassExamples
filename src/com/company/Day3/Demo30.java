package com.company.Day3;

import java.lang.reflect.Executable;

public class Demo30 {
    public static void main(String[] args) {

        //1st
        try{

        }catch (Exception e){

        }

        //2nd
        try{

        }catch (ArithmeticException e){

        }catch (Exception e){

        }

        //3rd
        try{
            try{

            }catch (Exception ex) {

            }
        }catch (Exception ex){

        }

        //4th
        try{

        }finally{

        }

        //5th (This is not allowed)
//        catch (Exception e){
//
//        }
    }
}
