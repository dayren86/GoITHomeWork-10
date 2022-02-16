package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OddTest {

    public static void main(String[] args) {
        List<Names> namesList = new ArrayList<>();
        String[] nameArrays = {"Emma", "Olivia", "Ava", "Sophia", "Isabella", "Olivia", "Mia", "Charlotte", "Olivia", "Abigail", "Emily", "Harper"};
        for (int i = 0; i < nameArrays.length; i++) {
            namesList.add(new Names(i, i + "." + nameArrays[i]));
        }

        List<Names> name = namesList
                .stream()
                .filter(names -> names.indexName % 2 != 0)
                .peek(x -> System.out.println(x.name))
                .collect(Collectors.toList());

        System.out.println(name);
    }

}
