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
public class RunnableExample {
    
    public static void main(String[]args){
        
        // this requires a lot of boiler plate code... not optimal but it works
        Thread myFirstThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside thread boiiiii");
            }
        });
        
        // this removes the boiler plate code, super clean
        
        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside lambda thread bb"));
        
        
        myFirstThread.run();
        myLambdaThread.run();
    }
    
}
