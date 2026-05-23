import java.util.ArrayList;

class Pessoa{
    private String nome;
    private int idade;
    private ArrayList<String> interesses = new ArrayList<String>();

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void adcionaInteresses(String interesse){
        this.interesses.add(interesse);
    }

    void removeInteresses(String interesse){
        this.interesses.remove(interesse);
    }
    void verInteresses(){
        for (int i = 0; i < this.interesses.size; i += 1){
            System.out.println('Interesse ' + (i + 1) + ': ' + this.interesses[i]);
        }
    }
    void verPessoa(){
        System.out.println('Nome: ')
        System.out.println('idade: ')
        System.out.println('interesses: ')
        verInteresses();
    }
    Grupo criaGrupo(String nome){
        return new Grupo(this, nome);
    }

}