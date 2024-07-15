package tratamentoeerros;

public class Causa {

    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println("Exceção capturada em main: " + e);
            System.out.println("Causa: " + e.getCause());
        }
    }

    public static void metodo1() throws Exception {
        try {
            metodo2();
        } catch (Exception e) {
            throw new Exception("Erro em metodo1, causado por metodo2", e);
        }
    }

    public static void metodo2() throws Exception {
        try {
            int resultado = 10 / 0; // Isto causará uma ArithmeticException
        } catch (ArithmeticException e) {
            throw new Exception("Erro em metodo2, divisão por zero", e);
        }
    }
}
