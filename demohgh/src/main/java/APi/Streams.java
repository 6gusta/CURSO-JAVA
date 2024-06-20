package APi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("luu", "gui", "Luca", "Ana");

        // Usando um loop for-each
        System.out.println("Usando for-each:");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        // Usando Iterator
        System.out.println("\nUsando Iterator:");
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Usando Streams
        System.out.println("\nUsando Streams:");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);
    }
}
