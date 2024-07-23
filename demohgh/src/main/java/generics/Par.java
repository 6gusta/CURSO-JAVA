package generics;

import java.util.Objects; // Importa a classe Objects para operações seguras com objetos

public class Par<C, V> {

    private C chave;
    private V valor;

    // Construtor padrão
    public Par() {
    }

    // Construtor com parâmetros
    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    // Métodos getter e setter para chave e valor
    public C getChave() {
        return chave;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    // Método hashCode que utiliza a chave
    @Override
    public int hashCode() {
        return Objects.hash(chave); // Usa Objects.hash para gerar hash com segurança
    }

    // Método equals para comparar objetos Par
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Verifica se são o mesmo objeto
        if (obj == null) return false; // Se obj for null, retorna false
        if (getClass() != obj.getClass()) return false; // Verifica se são da mesma classe

        Par<?, ?> other = (Par<?, ?>) obj; // Cast para Par genérico

        return Objects.equals(chave, other.chave); // Compara chaves de forma segura
    }
}
