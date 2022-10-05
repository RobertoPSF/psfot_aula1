public class Fachada {

    private Service s = new Service();

    public void criarProduto(String nome, String fabricante, double preco){
        this.s.criarProduto(nome, fabricante, preco);
    }

    public void criarLote(){
        s.criarLote();
    }

    public void lerProdutos(){
        this.s.lerProdutos();
    }

    public void lerLote(){
        s.lerLote();
    }

    /*public void atualizarProduto(String nome, String fabricante, double preco){
        this.s.atualizarProduto(nome, fabricante, preco);

    }

    public void excluirProduto(String nome, String fabricante, double preco){
        this.s.excluirProduto(nome, fabricante, preco);  
    }*/
}
