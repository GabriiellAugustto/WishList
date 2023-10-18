package br.com.etecia.wishlist;

public class List {
    private int id;
    private String descricao, data;

    public List (){}

    public List (int id, String descricao,String data){
        this.id = id;
        this.data = data;
        this.descricao= descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
