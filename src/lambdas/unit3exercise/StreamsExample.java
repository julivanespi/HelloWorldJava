package lambdas.unit3exercise;

import java.util.List;
import java.util.Arrays;
import lambdas.common.*;

public class StreamsExample {

    public static void main(String[] args) {
        
        List<Person> people = Arrays.asList(
                new Person("Julio", "Espinosa", 27),
                new Person("Cassie", "Souza", 25),
                new Person("Bryan", "Espinosa", 23)
        );

        // example of stream filtering
        // you notice that we can very quickly just filter out person objects from the list
        people.stream().filter(p -> p.getLastName().startsWith("E")).forEach(System.out::println);

        // now returning an int
        long x = people.stream()
            .filter(p -> p.getLastName().startsWith("E"))
            .count();
        System.out.println(x);
        
    }
    
}