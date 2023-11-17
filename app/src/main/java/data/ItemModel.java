package data;

// Classe de modelo de dados para os itens da lista
public class ItemModel {
    private String nome;
    private String descricao;

    public ItemModel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
