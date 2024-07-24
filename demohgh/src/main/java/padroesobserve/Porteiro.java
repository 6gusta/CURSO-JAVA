package padroesobserve;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

    private List<ChegadaAniversarioObservador> observadores = new ArrayList<>();

    // Método para registrar observadores
    public void registrarObservador(ChegadaAniversarioObservador observador) {
        observadores.add(observador);
    }

    // Método para monitorar a chegada do aniversariante
    public void monitorar() {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!"sair".equalsIgnoreCase(valor)) {

            System.out.println("O aniversariante chegou?");
            valor = entrada.nextLine();

            if ("sim".equalsIgnoreCase(valor)) {

                // Cria um novo evento com a data atual
                 EventoChegadaAnivesario evento = new   EventoChegadaAnivesario(new Date());

                // Notifica todos os observadores do evento
                observadores.forEach(o -> o.chegou(evento));

                valor = "sair";

            } else {
                System.out.println("Alarme falso!");
            }
        }

        entrada.close(); // Fecha o Scanner para liberar recursos
    }
}
