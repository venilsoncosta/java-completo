package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Stream<String> linguagens = Stream.of("Java ", "Python ", "JS\n");
        linguagens.forEach(System.out::println);

        String[] maisLinguagens = {"Go ", "Ruby ", "PHP ", "Portugol"};
        Stream.of(maisLinguagens).forEach(System.out::println);
        System.out.println();
        Arrays.stream(maisLinguagens).forEach(System.out::println);
        System.out.println();
        Arrays.stream(maisLinguagens, 1, 3).forEach(System.out::println);
    }
}
