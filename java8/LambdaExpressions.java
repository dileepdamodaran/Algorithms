package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressions {

    public static void main(String args[]) {
        List<Person> persons = new ArrayList();
        persons.add(new Person("Dileep", "damodaran", 38));
        persons.add(new Person("dan", "dilter", 38));
        persons.add(new Person("alex", "cary", 32));

        // Filter operation in stream
        persons = persons.stream().filter(p -> p.getAge() > 32 && null != p).collect(Collectors.toList());

        // Filter chaining to be more readable
        persons.stream().filter(person -> person != null) // Filtering the object where name is not null
                .filter(person -> person.getAge() > 18) // Filtering the objects where age is greater than 18
                .filter(person -> person.getAge() < 60) // Filtering the objects where age is less than 60
                .forEach(System.out::println);

        // Mapping operation in stream
        Stream<List<Person>> personsLst = persons.stream().map(person -> person.getFirstNm().toUpperCase());
        System.out.println(persons);
    }

}
