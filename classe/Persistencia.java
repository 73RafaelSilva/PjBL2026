
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Persistencia {

    public static void salvarAgenda(Agenda agenda) {

        try {

            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream("agenda.dat"));

            out.writeObject(agenda);

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

            System.out.println("Arquivo não encontrado.");
            return new Agenda();

        }
    }
}
