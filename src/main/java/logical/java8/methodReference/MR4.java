package logical.java8.methodReference;

import java.util.function.Function;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class MR4 {
    public static void main(String[] args) {
        Function<String, Person> personCreator = Person::new;
        Person person = personCreator.apply("manoj");
        System.out.println(person.name);
    }
}

