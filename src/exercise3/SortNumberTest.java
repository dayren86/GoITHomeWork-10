package exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumberTest {
    public static void main(String[] args) {
        String[] number = {"1, 2, 0", "4, 5"};
        List<String> res = Arrays.asList(number)
                .stream()
                .map(str -> str.split(","))
                .flatMap(array -> Arrays.stream(array))
                .map(s -> s.trim())
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("res = " + res);
    }
}
