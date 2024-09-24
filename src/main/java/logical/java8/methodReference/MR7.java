package logical.java8.methodReference;

import org.apache.catalina.realm.CombinedRealm;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MR7 {
    public static void main(String[] args) {
        //Method Reference with Optional

        Optional<String> optional = Optional.of("hello");
        optional.ifPresent(System.out::print);
        optional.map(String::toUpperCase).ifPresent(System.out::println);


    }

}
