package tratamentoeerros;

public class Checadavsnaocheada {

    public static void main(String[] args) {
        // Teste para verificar o lançamento das exceções
        try {
            gearerro();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            Gearerro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("fim");
    }

    // Exceção não verificada
    static void gearerro() {
        throw new RuntimeException("ocorreu um erro 01");
    }

    // Exceção verificada
    static void Gearerro2() throws Exception {
        throw new Exception("ocorreu um erro 2");
    }
}
