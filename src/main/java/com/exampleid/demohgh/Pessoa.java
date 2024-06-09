package com.exampleid.demohgh;

public class Pessoa {


    private int idade;
    String nome;
    String sobrenome;

    public Pessoa(String nome , int idade,String sobrenome) {

        setNome(nome);
        setIdade(idade);
        setSobrenome(sobrenome);
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        alteraIdade(idade);
    }

    public void alteraIdade( int novaIdade){
        novaIdade= Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade  <=120 ){
            this.idade = novaIdade;
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getnomecompletp(){
        return getNome()+ ""+ getSobrenome();
    }
    
    
    

    @override
    public String toString(){
        return " ola eu sou o "+ getNome() + " tenho "+ getIdade()+ "anos";
    }





    

    
}