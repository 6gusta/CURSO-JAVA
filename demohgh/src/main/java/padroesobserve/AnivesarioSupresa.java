package padroesobserve;

public class AnivesarioSupresa {

    public static void main(String[] args) {
        Namorada namorada = new Namorada(); // Cria uma instância da Namorada
        Porteiro porteiro = new Porteiro(); // Cria uma instância do Porteiro

        // Registra a Namorada como observadora
        porteiro.registrarObservador(e ->{
            System.out.println("Surpresa via lambda ");
            System.out.println(" ocrreu um erro em "+ e.getMomento());
        });

        // Inicia o monitoramento
        porteiro.monitorar();
    }
}
