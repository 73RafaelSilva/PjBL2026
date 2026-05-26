import java.util.ArrayList;

public class Grupo {

    private ArrayList<Pessoa> pessoas;
    
    private ArrayList<Pessoa> pessoasAdm;

    private ArrayList<String> interesses;

    private ArrayList<Evento> evento;

    private String nome;

    Grupo(Pessoa pessoa, String nome){
        this.pessoas = new ArrayList<Pessoa>();
        this.pessoasAdm = new ArrayList<Pessoa>();
        this.pessoasAdm.add(pessoa);
        this.interesses = new ArrayList<String>();
        this.evento = new ArrayList<Evento>();
        this.nome = nome;
    }

   void convidar (Pessoa convidado) {

        this.pessoas.add (convidado);
            System.out.println("convidando a pessoa" + convidado.getNome());

   }

   void criar (Evento evento) {

        this.evento.add (evento);
            System.out.println("Criação evento" + evento.mostrarEvento());

   }

}