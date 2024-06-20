package lambda2;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "par" : "impar";

        System.out.println(parOuImpar.apply(33));

        Function<String, String> oResultado = valor -> " o resultado  e " + valor;


        Function<String, String> emplgado = valor -> valor + "! ! !";

        Function<String, String> duvida = valor -> valor + "? ? ? ";

        String resultadofinal = parOuImpar.andThen(oResultado).andThen(emplgado).apply(32);
        System.out.println(resultadofinal);



        String resultadofinal2 = parOuImpar.andThen(oResultado).andThen(duvida).apply(32);
        System.out.println(resultadofinal2);
    }
    }

