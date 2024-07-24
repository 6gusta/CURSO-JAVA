package padroesobserve;

// Implementa a interface correta para observadores
public class Namorada implements ChegadaAniversarioObservador { // Correção de digitação no nome da interface

  
  
    public void chegou(EventoChegadaAnivesario evento) {
        System.out.println("Avisar convidados...");
        System.out.println("Apagar as luzes...");
        System.out.println("Esperar um pouco...");
        System.out.println("E... surpresa!");
    }
}
