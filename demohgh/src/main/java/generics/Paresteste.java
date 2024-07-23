package generics;

public class Paresteste {

    public static void main(String[] args) {
        pares<Integer, String> resultadoConcurso = new pares<>();

        // Adicionando valores
        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Pedro");
        resultadoConcurso.adicionar(3, "Guii");
        resultadoConcurso.adicionar(4, "Rebecca");

        // Sobrescrevendo o valor da chave 1
        resultadoConcurso.adicionar(1, "João");

        // Imprimindo os valores
        System.out.println("Chave 1: " + resultadoConcurso.getValor(1)); // Espera-se "João"
        System.out.println("Chave 4: " + resultadoConcurso.getValor(4)); // Espera-se "Rebecca"
        System.out.println("Chave 2: " + resultadoConcurso.getValor(2)); // Espera-se "Pedro"
        System.out.println("Chave 5: " + resultadoConcurso.getValor(5)); // Espera-se "null" (não existe)
    }
}
