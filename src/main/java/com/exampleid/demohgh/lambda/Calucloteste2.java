package com.exampleid.demohgh.lambda;

public class Calucloteste2 {

    public static void main(String[] args) {

        Caulculo caulculo = (x,y) -> { return x + y;};

            System.out.println(caulculo.executar(2,3));

            caulculo = (x,y) -> x * y;
            System.out.println(caulculo.executar(2,3));

            System.out.println(caulculo.legal());

            

        };


        
    }

    
    

