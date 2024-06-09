package com.exampleid.demohgh;

public class Pessoasteste {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("pedro",45, "mato ");
        p1.setIdade(-30); 


        System.out.println(p1.getIdade());
        System.out.println(p1);
        System.out.println(p1.getnomecompletp());

    }
    
}
