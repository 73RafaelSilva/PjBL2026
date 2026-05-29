public class SubGrupo extends Grupo {

    private String descricao;

    public SubGrupo(Pessoa pessoa, String nome, String descricao) {
        super(pessoa, nome);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void mostrarSubGrupo() {
        System.out.println("SubGrupo criado: " + descricao);
    }
}
