//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//import java.util.List;

public class ProdRep {

    private Map<String, Produto> mapaProdutos = new HashMap<> ();
    //private List<Produto> produtos = new ArrayList<Produto> ();

    public void salvarProduto(Produto p){
        //produtos.add(p);
        mapaProdutos.put(p.getNome(), p);
    }
    
    public Map<String, Produto> lerProduto(){
        //return produtos;
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
