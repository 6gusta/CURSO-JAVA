package lambda2;

import java.util.function.Predicate;

public class predicado02 {

    public static void main(String[] args) {
        

        Predicate<Integer> isPAR = num -> num % 2 == 0;

        Predicate<Integer> istresdigito = num -> num  >= 100 && num <= 999;
        System.out.println(isPAR.test(22));


    }
    
}
