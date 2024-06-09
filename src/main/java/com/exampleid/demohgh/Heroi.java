package com.exampleid.demohgh;

public class Heroi extends Jogador {

    public Heroi(int x , int y){
        super(x, y);
    }

 
    public boolean atacar(Jogador oponente ){

       super.atacar(oponente);

       boolean ateque1 = super.atacar(oponente);
       boolean ateque2 = super.atacar(oponente);
       boolean ateque3 = super.atacar(oponente);
       return ateque1 || ateque2 || ateque3;


        }









    }

    

