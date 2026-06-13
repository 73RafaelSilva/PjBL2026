
import java.io.Serializable;
import java.util.ArrayList;

class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private int idade;
    private ArrayList<String> interesses = new ArrayList<String>();

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void adcionaInteresses(String interesse) {
        this.interesses.add(interesse);
    }

    void removeInteresses(String interesse) {
        this.interesses.remove(interesse);
    }

    void verInteresses() {
        for (int i = 0; i < this.interesses.size(); i += 1) {
            System.out.println("Interesse " + (i + 1) + ": " + this.interesses.get(i));
        }
    }

    void verPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Interesses: ");
        verInteresses();
    }

    String getNome() {
        return this.nome;
    }

    int getIdade() {
        return this.idade;
    }

    ArrayList<String> getInteresses() {
        return this.interesses;
    }

    Grupo criaGrupo(String nome) {
        return new Grupo(this, nome);
    }
}
