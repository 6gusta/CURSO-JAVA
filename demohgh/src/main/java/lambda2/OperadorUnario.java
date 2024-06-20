package lambda2;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    UnaryOperator<Integer> maisdois = n -> n +2 ;
    UnaryOperator<Integer> vezesdois = n -> n * 2 ;
    UnaryOperator<Integer> aoquadradro = n -> n * n;


int resultado1 = maisdois
.andThen(vezesdois)
.andThen(aoquadradro)
.apply(0);
System.out.println(resultado1);

int resultado2 = aoquadradro
.compose(vezesdois)
.compose(maisdois)
.apply(0);
System.out.println(resultado2);



    
}
