package classes;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    int id;
    String nome;
    String descricao;
    String data;
    String local;

    ArrayList<Pessoa> participantes;

    public Evento() {
        participantes = new ArrayList<>();
    }

    public Evento(int id, String nome, String descricao, String data, String local) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.local = local;
        this.participantes = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getData() {
        return this.data;
    }

    public String getLocal() {
        return this.local;
    }

    public String mostrarEvento() {
        return "Evento: " + nome +
               " Data: " + data +
               " Local: " + local;
    }
}
