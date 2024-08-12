package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        Optional<Integer> sortnumbers1  =  numbers.stream().filter(num -> num % 2 == 0).reduce((x, y) -> x + y);
        Optional<Integer> sortnumbers2 =  numbers.stream().filter(num -> num % 2 != 0).reduce((x1, y1) -> x1 + y1);
        System.out.println(sortnumbers1.get());
        System.out.println();
        System.out.println(sortnumbers2.get());



//        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        Optional<Integer> numbers1 =numbers.filter(x -> x % 2== 0).reduce((a1 , a2) -> a1 + a2);
//        System.out.println(numbers1.get());
    }
}
