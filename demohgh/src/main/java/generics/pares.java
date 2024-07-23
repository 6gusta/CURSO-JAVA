package generics;

import java.util.Optional;
import java.util.SortedSet;
import java.util.TreeSet;

public class pares<C, V> {

    // Coleção ordenada de pares
    private final SortedSet<Par<C, V>> intens = new TreeSet<>((par1, par2) -> ((Comparable<C>) par1.getChave()).compareTo(par2.getChave()));

    // Método para adicionar pares à coleção
    public void adicionar(C chave, V valor) {
        if (chave == null) return;

        Par<C, V> novoPar = new Par<>(chave, valor);

        // Remove o par existente se já estiver presente
        if (intens.contains(novoPar)) {
            intens.remove(novoPar);
        }

        // Adiciona o novo par à coleção
        intens.add(novoPar);
    }

    // Método para obter o valor associado a uma chave
    public V getValor(C chave) {
        if (chave == null) return null;

        // Encontra o primeiro par correspondente à chave
        Optional<Par<C, V>> parOpcional = intens.stream()
            .filter(par -> chave.equals(par.getChave()))
            .findFirst();

        // Retorna o valor encontrado ou null se não existir
        return parOpcional.map(Par::getValor).orElse(null);
    }
}
