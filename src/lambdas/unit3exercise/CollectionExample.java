package lambdas.unit3exercise;

import java.util.Arrays;
import java.util.List;
import lambdas.common.*;


public class CollectionExample {

    public static void main(String[] args) {
        
        List<Person> people = Arrays.asList(
                new Person("Julio", "Espinosa", 27),
                new Person("Cassie", "Souza", 25),
                new Person("Bryan", "Espinosa", 23)
        );

        System.out.println("The old for each loop way");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("The lambda way");
        //people.forEach(p -> System.out.println(p));
        people.forEach(System.out::println);
    }
}