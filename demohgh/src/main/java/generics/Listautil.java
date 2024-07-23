package generics;

import java.util.List;

public class Listautil {

    // Generic method to get the last element from a list
    public static <T> T getUltimoq(List<T> lista) {
        return lista.get(lista.size() - 1);
    }
}
