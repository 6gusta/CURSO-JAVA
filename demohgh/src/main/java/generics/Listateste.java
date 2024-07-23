package generics;

import java.util.Arrays; // Correct import for Arrays.asList()
import java.util.List;

public class Listateste {

    public static void main(String[] args) {

        // Corrected method to create a list from array literals
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");

        // Correct Integer type and method to create list
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        // Fetch the last element from the langs list
        String ultimaLingua = Listautil.getUltimoq(langs);
        System.out.println("Última linguagem: " + ultimaLingua);

        // Fetch the last element from the nums list
        Integer ultimoNumero = Listautil.getUltimoq(nums);
        System.out.println("Último número: " + ultimoNumero);
    }
}
