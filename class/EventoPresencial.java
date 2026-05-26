public class EventoPresencial extends Evento {

    int capacidade;

    public EventoPresencial() {

    }

    public EventoPresencial(int id, String nome, String descricao, String data, String local, int capacidade) {
        super(id, nome, descricao, data, local);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    @Override
    public String MostrarEvento() {
        return "Evento: " + nome +
               " Data: " + data +
               " Local: " + local +
               " Capacidade: " + capacidade;
    }
}
