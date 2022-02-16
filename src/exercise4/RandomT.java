package exercise4;

import java.util.stream.Stream;

public class RandomT {

    public Stream<Long> randomMetod (Long a, Long c, Long m, Long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        RandomT r = new RandomT();

        r.randomMetod(25214903917l,11l,281474976710656l,2l)
                .limit(30)
                .forEach(System.out::println);
    }
}
