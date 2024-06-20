package lambda2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecdor {

    public static void main(String[] args) {
        Supplier < List<String>> umList = () -> Arrays.asList(" ana ", " bia", "lia", "guilerme");

        System.out.println(umList.get());
    }
    
}
