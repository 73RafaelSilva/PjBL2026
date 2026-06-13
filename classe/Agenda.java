import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Agenda implements Serializable {

    private static final long serialVersionUID = 1L;

    private ArrayList<Evento> eventos;

    public Agenda() {
        eventos = new ArrayList<>();
    }

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
            System.out.println(evento.mostrarEvento());
            System.out.println("");
        }
    }

    public void salvarAgenda() {
        try {
            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream("agenda.dat"));

            out.writeObject(this);
            out.close();

            System.out.println("Agenda salva com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao salvar agenda.");
            e.printStackTrace();
        }
    }

    public static Agenda carregarAgenda() {
        try {
            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream("agenda.dat"));

            Agenda agenda = (Agenda) in.readObject();

            in.close();

            System.out.println("Agenda carregada com sucesso!");

            return agenda;

        } catch (Exception e) {
            System.out.println("Arquivo não encontrado. Criando nova agenda.");
            return new Agenda();
        }
    }
}
