package generics;

public class Caixateste {

    public static void main(String[] args) {

       Caixas<String> caixaA = new Caixas<>();

       caixaA.aguardar("Segredo !");

       String coisaA = caixaA.abrir();
       System.out.println(coisaA);


       Caixas<Double> caixaB = new Caixas<>();
       caixaB.aguardar("segredos ");



       Double coisaB = caixaB.abrir();

       System.out.println(coisaA);







        
    }
    
}
