public class EventoOnline extends Evento {

    String link;

    public EventoOnline() {

    }

    public EventoOnline(int id, String nome, String descricao, String data, String local, String link) {
        super(id, nome, descricao, data, local);
        this.link = link;
    }

    public String getLink() {
        return this.link;
    }

    public String MostrarEventoOnline() {
        return "Evento: " + nome + 
               " Data: " + data + 
               " Local: " + local + 
               " Link: " + link;
    }
}
