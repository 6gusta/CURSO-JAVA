package padroesobserve;

import java.util.Date;

public class EventoChegadaAnivesario { // Verifique o nome da classe

    private final Date momento;

    public EventoChegadaAnivesario(Date momento) {
        this.momento = momento;
    }

    public Date getMomento() {
        return momento;
    }
}
