package classes;
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

   void sair (Pessoa sair) {

        this.pessoas.remove (sair);
            System.out.println("saiu do grupo");
   }

   void promover (Pessoa promocao) {

        this.pessoas.remove (promocao);
        this.pessoasAdm.add (promocao);
        System.out.println("Foi promovida a admin");
   }

   void revogar (Pessoa revogacao) {

        this.pessoasAdm.remove (revogacao);
        this.pessoas.add (revogacao);
        System.out.println("Foi revogada de ser um admin");
   }
}