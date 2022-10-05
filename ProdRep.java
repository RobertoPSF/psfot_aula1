import java.util.HashMap;
import java.util.Map;

public class ProdRep {

    private Map<String, Produto> mapaProdutos = new HashMap<> ();

    public void salvarProduto(Produto p){
        mapaProdutos.put(p.getNome(), p);
    }
    
    public Map<String, Produto> lerProduto(){
        return mapaProdutos;
    }

    /*public void atualizarProduto(Produto p){
        for (Produto produto : produtos) {
            if (produto.getNome() == p.getNome()){
                produtos.remove(produto);
                produtos.add(p);
            }   
        }
    }

    public void excluirProduto(Produto p){
        produtos.remove(p);
    }*/
}
