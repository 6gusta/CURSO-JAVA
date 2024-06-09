package com.exampleid.demohgh.polimorfismo;

public class Janta {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente = new Arroz(0.180);
        Feijao ingrediente2 = new Feijao(0.180);

        // Printing the initial weight of convidado
        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente);
        convidado.comer(ingrediente2);

        // Printing the updated weight of convidado
        System.out.println(convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.4);
        convidado.comer(sobremesa);


        System.out.println(convidado.getPeso());
    }
}

