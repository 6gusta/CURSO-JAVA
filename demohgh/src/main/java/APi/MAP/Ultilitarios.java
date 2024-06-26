package APi.MAP;

import java.util.function.UnaryOperator;

public interface Ultilitarios {


    private Ultilitarios(){
        
    }

    


   public final static UnaryOperator<String> maiscula =
    n -> n.toUpperCase();
   public final static UnaryOperator<String> primeiraletra =
    n -> n.charAt(0) + "";
   public  static String grito(String n) {
   return n + "! ! !";
}
    
}
