package exercise5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMerge {

    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("Emma", "Olivia", "Ava", "Sophia", "Isabella", "Olivia");
        Stream<String> streamB = Stream.of("1", "2", "3","4");
        Stream<String> zip = zip(streamA, streamB);
        zip.peek(System.out::println).collect(Collectors.toList());
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> list = new ArrayList<>();

        Iterator<T> iteratorA = first.iterator();
        Iterator<T> iteratorB = second.iterator();

        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            list.add(iteratorA.next());
            list.add(iteratorB.next());
        }

        return list.stream();
    }
}
