/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas.unit1exercise;

import lambdas.common.Person;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author julio
 */
public class Unit1Exercise {
    
    public static void main(String[]args){
        // TODO: do it
        List<Person> people = Arrays.asList(
                new Person("Julio", "Espinosa", 27),
                new Person("Cassie", "Souza", 25),
                new Person("Bryan", "Espinosa", 23)
        );
        
        /**
         * The java 7 way
         */
        
        // Setp 1 - sort list by last name
        Collections.sort(people, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        
        // Step 2 - Create a method  that prints all elements in the list 
        System.out.println("***********************************************");
        printAll(people);
        
        // Step 3 - Create a method that prints all people with the last name espinosa
        System.out.println("***********************************************");
        printCondition(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("E");
                }
        });
        
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        
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

    
    /**
     * Method to print all people
     * @param people 
     */
    private static void printAll(List<Person> people) {
        for(Person person : people){
            System.out.println(person);
        }
    }

    private static void printCondition(List<Person> people, Condition condition) {
        for(Person person: people){
            if(condition.test(person)){
                System.out.println(person);
            }
        }
    }
    
}

interface Condition{
    boolean test(Person p);
}

