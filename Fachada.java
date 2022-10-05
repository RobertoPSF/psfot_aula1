public class Fachada {

    private Service s = new Service();

    public void criarProduto(String nome, String fabricante, double preco){
        s.criarProduto(nome, fabricante, preco);
    }

    public void criarLote(int quantidade, String data, String nome){
        s.criarLote(quantidade, data, nome);
    }

    public void lerProdutos(){
        s.lerProdutos();
    }

    public void lerLote(){
        s.lerLote();
    }

    public void atualizarProduto(String nome, String fabricante, double preco){
        s.atualizarProduto(nome, fabricante, preco);

    }

    public void atualizarLote(){}

    public void excluirProduto(String nome, String fabricante, double preco){
        s.excluirProduto(nome, fabricante, preco);  
    }

    public void excluirLote(){}
}
