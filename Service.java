import java.util.List;

public class Service {

    ProdRep r = new ProdRep();

    public void criarProduto(String nome, String fabricante, double preco){
        Produto p = new Produto(nome, fabricante, preco);
        r.salvarProduto(p);
    }

    public void criarLote(){}

    public void lerProdutos(){
        List<Produto> lista = r.lerProduto();
        for (Produto produto : lista) {
            System.out.println(produto);
        }
    }

    public void lerLote(){}

    /*public void atualizarProduto(String nome, String fabricante, double preco){
        Produto p = new Produto(nome, fabricante, preco);
        r.atualizarProduto(p);
    }

    public void excluirProduto(String nome, String fabricante, double preco){
        Produto p = new Produto(nome, fabricante, preco);
        r.excluirProduto(p);
    }*/
}
