package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Александр");
        names.add("Марина");
        names.add("Паша");
        names.add("Александр");
        names.add("Александр");
        names.add("Дима");
        List<String> namesUniq =  names.stream().distinct().collect(Collectors.toList());
        System.out.println(namesUniq);

    }

}
