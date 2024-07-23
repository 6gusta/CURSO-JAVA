package generics;

public class CaixaObjetoteste {



    public static void main(String[] args) {
        CauxaObjeto caixaA = new CauxaObjeto();
        caixaA.guardar(2.3);

    double coisaA =(double) caixaA.abrir();

        System.out.println(coisaA);

        CauxaObjeto caixaB = new CauxaObjeto();
        caixaA.guardar("ola");


        String coisa = (String ) caixaB.abrir();
        System.out.println(coisa);
        
    }
    
}
