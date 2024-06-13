 package com.exampleid.demohgh;

 
import java.util.ArrayList;
import java.util.List;

 public class Compra {

    final List<Intem> intens = new ArrayList<>();


    void AdicionarIntem(Produto p, int quantidade){
        this.intens.add(new Intem(p, quantidade));
    }
    void AdicionarIntem(String nome  ,double preço, int quantidade){

        var produto = new Produto(nome, preço);
        this.intens.add(new Intem(produto,quantidade));
    }
    


    double obterValorTotal(){

        double total = 0;


        for(Intem intem : intens){
            total += intem.quantidade *intem.produto.preço;
        }

        return total;

    }

    
}
