import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private ArrayList<Evento> eventos;

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);


    }

    public void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Sem eventos cadastrados.");
            return;
        }

        System.out.println("Agenda de eventos");

        for (Evento evento : eventos) {
            System.out.println(evento);
            System.out.println("");
        }
    }
}