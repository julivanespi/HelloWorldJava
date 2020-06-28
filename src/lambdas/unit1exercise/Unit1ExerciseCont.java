/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas.unit1exercise;

import lambdas.common.Person;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author julio
 */
public class Unit1ExerciseCont {
    public static void main(String[]args){
        // TODO: do it
        List<Person> people = Arrays.asList(
                new Person("Julio", "Espinosa", 27),
                new Person("Cassie", "Souza", 25),
                new Person("Bryan", "Espinosa", 23)
        );
        
        /**
         * The java 8 way 
         */
        
        // Setp 1 - sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        
        // Step 2 - Create a method  that prints all elements in the list 
        System.out.println("\n***********************************************");
        printCondition(people, p -> true);
        
        // Step 3 - Create a method that prints all people with the last name espinosa
        System.out.println("***********************************************");
        printCondition(people, p -> p.getLastName().startsWith("E"));
    }


    private static void printCondition(List<Person> people, Predicate<Person> predicate) {
        for(Person p: people){
            if(predicate.test(p)){
                System.out.println(p);
            }
        }
    }
    
}
