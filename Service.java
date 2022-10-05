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
        Map<String, Produto> mapaProdutos = rp.lerProduto();
        if (mapaProdutos.size() != 0){
            for (Produto produto : mapaProdutos.values()) {
                System.out.println(produto);
            }
        } else {
            System.out.println("\nNão tem produtos cadastrados.");
        }
    }

    public void lerLote(){
        Map<String, Lote> mapaLote = lr.lerLote();
        if (mapaLote.size() != 0) {
            for (Lote lote : mapaLote.values()) {
                System.out.println(lote);
            }
        } else {
            System.out.println("\nNão tem lotes cadastrados.");
        }
    }

    public void atualizarProduto(String nome, String fabricante, double preco){
        Produto p = new Produto(nome, fabricante, preco);
        rp.atualizarProduto(p);
    }

    public void atualizarLote(){}

    public void excluirProduto(String nome, String fabricante, double preco){
        Produto p = new Produto(nome, fabricante, preco);
        rp.excluirProduto(p);
    }

    public void excluirLote(){}
}
