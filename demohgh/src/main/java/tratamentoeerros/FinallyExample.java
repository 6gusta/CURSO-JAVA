package tratamentoeerros;

import java.util.Scanner;

public class FinallyExample {

    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);

            System.out.println(7 / entrada.nextInt());

            entrada.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("finally..");
        }
        System.out.println("fim");
    }
}
