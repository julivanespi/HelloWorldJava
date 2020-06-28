/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

/**
 *
 * @author julio
 */
public class TypeInferenceExample {
    public static void main(String[]args){
        //TODO
        MyPincheLambda noice = s -> s.length(); 
        System.out.println(noice.getLength("No mames weyyyyyyy"));
    }
    
    interface MyPincheLambda{
        int getLength(String s);
    }
}
