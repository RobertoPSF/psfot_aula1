

public class Lote {

    private int quantidade;
    private String data;
    private Produto produto;

    public Lote(){}

    public Lote(int quantidade, String data, Produto produto){
        this.quantidade = quantidade;
        this.data = data;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
