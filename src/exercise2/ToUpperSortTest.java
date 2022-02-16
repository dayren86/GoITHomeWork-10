package exercise2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperSortTest {
    public static void main(String[] args) {

        String namesList = "Emma Olivia Ava Sophia Isabella Olivia Mia Charlotte Olivia Abigail Emily Harper";
        String[] namesSplit = namesList.split(" ");
        List<String> names = Arrays.asList(namesSplit)
                .stream()
                .map(s -> s.toUpperCase())
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
