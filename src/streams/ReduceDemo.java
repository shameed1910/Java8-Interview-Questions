package streams;


import java.util.Arrays;
import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,4,6,8);
        int result=numbers.stream().reduce(1,(total,element)-> total+element);
        System.out.println(result);

        List<String> letters= Arrays.asList("a","b","c","d","e","f");
        String output=letters.stream().reduce("",(String::concat));
        String outputConcatenate=letters.stream().reduce("",(string,element)->string.toUpperCase()+element.toLowerCase());
        System.out.println(output);
        System.out.println(outputConcatenate);

        List<User> users=Arrays.asList(new User("hameed",20), new User("hameed",20));
        int computedAges=users.stream().reduce(0,(ageResult,user)->ageResult + user.getAge(),Integer::sum);
        System.out.println(computedAges);

    }



}
