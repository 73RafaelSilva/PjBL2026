import java.util.ArrayList;
import java.util.ArrayListist;

public class Grupo {

    private ArrayList<Pessoa> pessoas;
    
    private ArrayList<Pessoa> pessoasAdm;

    private ArrayList<String> interesses;

    private ArrayList<Evento> evento;

    private String nome;


    Grupo(Pessoa pessoa, String nome){
        this.pessoas = new ArrayList<Pessoa>();
        this.pessoasAdm = new ArrayList<Pessoa>().add(pessoa);
        this.interesses = new ArrayList<String>();
        this.evento = new ArrayList<Evento>();
        this.nome = nome;
    }


}
