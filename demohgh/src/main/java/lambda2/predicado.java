package lambda2;

import java.util.function.Predicate;

// Verifique se o caminho do pacote está correto
import com.exampleid.demohgh.Produto;

public class predicado {

    public static void main(String[] args) {
        
        // Atributo 'preco' no lugar de 'preço' e corrigindo a chamada de métodos
        Predicate<Produto> isCaro = prod -> (prod.getPreco() * (1 - prod.getDesconto())) >= 750;

        // Corrigido para 'Produto'
        Produto p = new Produto("Notebook", 3893.89, 0.15);

        System.out.println(isCaro.test(p));
    }
}
