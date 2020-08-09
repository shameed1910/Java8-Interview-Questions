package streams;

import org.w3c.dom.ls.LSOutput;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekDemo {


    public static void main(String[] args) {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))//This method exists mainly to support debugging
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        Stream<Employee> userStream = Stream.of(
                new Employee("Tom","ADMIN",2000),
                new Employee("Ryan","FINANCE",4000),
                new Employee("Tim","IT",2000));
       // userStream.forEach(System.out::println);
        userStream.peek(u -> u.setName(u.getName().toUpperCase())).forEach(System.out::println);
    }
}
