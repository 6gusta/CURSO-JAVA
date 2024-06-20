package APi;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;
        Stream<String> Langs = Stream.of("java","Lua", "JS\n");
        Langs.forEach(print);


        String[] maislangs = {"python", "lisp", "perl", "Go\n"};

        Stream.of(maislangs).forEach(print);
        Arrays.stream(maislangs).forEach(print);
        Arrays.stream(maislangs, 1, 2).forEach(print);

        List<String>outraslangs = Arrays.asList("c", "PHP", " Kotlim\n");
        outraslangs.stream().forEach(print);
        outraslangs.parallelStream().forEach(print);

        //Stream.generate(() -> "a").forEach(print);
        //Stream.iterate(0, n -> n + 1).forEach(print);

        
    }
    
}
