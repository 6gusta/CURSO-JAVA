package lambda2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.exampleid.demohgh.Produto;

public class Consumidor {

    public static void main(String[] args) {

        // Corrigido para usar java.util.function.Consumer
        Consumer<Produto> imprimirNome = p -> System.out.println(p.getNome() + " !! !");

        // Corrigido para 'Produto'
        Produto p1 = new Produto("Caneta", 12.34, 0.09);

        imprimirNome.accept(p1);

        Produto p2 = new Produto("Notebook", 1234.89, 0.15);
        Produto p3 = new Produto("Caneta", 13.34, 0.09);
        Produto p4 = new Produto("Borracha", 1.34, 0.09);
        Produto p5 = new Produto("Caneta", 19.34, 0.09);

        // Renomeando a lista de produtos para evitar confusão com a classe Produto
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        // Usando a variável correta para iterar e imprimir os nomes dos produtos
        produtos.forEach(imprimirNome);
        
        // Imprimindo preços usando método getter
        produtos.forEach(p -> System.out.println(p.getPreco()));

        // Imprimindo a representação completa dos objetos, necessita de toString na classe Produto
        produtos.forEach(System.out::println);
    }
}
