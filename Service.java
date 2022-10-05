//import java.util.List;
import java.util.Map;

public class Service {

    ProdRep rp = new ProdRep();
    LoteRep lr = new LoteRep();

    public void criarProduto(String nome, String fabricante, double preco){
        Produto p = new Produto(nome, fabricante, preco);
        rp.salvarProduto(p);
    }

    public void criarLote(int quantidade, String data, String nome){
        Map<String, Produto> mapa = rp.lerProduto();
        Produto p = mapa.get(nome);
        Lote l = new Lote(quantidade, data, p);
        lr.salvarLote(p, l);
    }

    public void lerProdutos(){
        Map<String, Produto> mapa = rp.lerProduto();
        for (Produto produto : mapa.values()) {
            System.out.println(produto);
        }
    }

    public void lerLote(){
        Map<String, Lote> mapaLote = lr.lerLote();
        for (Lote lote : mapaLote.values()) {
            System.out.println(lote);
        }
    }

    /*public void atualizarProduto(String nome, String fabricante, double preco){
        Produto p = new Produto(nome, fabricante, preco);
        rp.atualizarProduto(p);
    }

    public void excluirProduto(String nome, String fabricante, double preco){
        Produto p = new Produto(nome, fabricante, preco);
        rp.excluirProduto(p);
    }*/
}
