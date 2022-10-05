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

    public void atualizarProduto(Produto p){
        for (Produto produto : mapaProdutos.values()) {
            if (produto.getNome() == p.getNome()){
                mapaProdutos.remove(p.getNome());
                mapaProdutos.put(p.getNome(), p);
            }   
        }
    }

    public void excluirProduto(Produto p){
        mapaProdutos.remove(p.getNome());
    }
}
