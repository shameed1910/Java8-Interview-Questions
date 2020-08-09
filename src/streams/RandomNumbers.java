package streams;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        Random random=new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }
}
