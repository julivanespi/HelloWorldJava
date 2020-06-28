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
public class Basic {
    
    public static void main(String []args){
        
        MyLambda sample = () -> System.out.println("dudeeees");
        
        sample.foo();
        
    }
}

interface MyLambda{
    void foo();
}