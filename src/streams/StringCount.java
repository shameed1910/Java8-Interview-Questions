package streams;

import java.util.Arrays;
import java.util.List;

public class StringCount {

    public static void main(String[] args) {
        String someString = "mango";
        long charCount = someString.chars().filter(ch -> ch == 'e').count();
        System.out.println(charCount);

        List<String> strings= Arrays.asList("abc","def","ghi","jklm","","");
        long count=strings.stream().filter(String->String.isEmpty()).count();
        System.out.println(count);

        List<String> strings1= Arrays.asList("abc","def","ghi","jklm","dd","abc");
        long charCount1= strings1.stream().filter(String-> String.equals("abc")).count();

        System.out.println(charCount1);
    }
}
