package com.exampleid.demohgh.lambda;

public class Caulculoteste {

    public static void main(String[] args) {

            Caulculo caulculo = new Soma();
            System.out.println(caulculo.executar(2,3));

             caulculo = new Multiplicar();
            System.out.println(caulculo.executar(2,3));


         
        
    }
    
}
