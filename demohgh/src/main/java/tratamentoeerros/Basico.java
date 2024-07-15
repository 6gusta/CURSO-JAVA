package tratamentoeerros;

public class Basico {
    public static void main(String[] args) {

        try{
            System.out.println(7/0);


        }catch(ArithmeticException e){
           System.out.println(" ocorreu um erro "+ e.getMessage());
        }

        System.out.println("fim");
        
        

        
    }
    
}
