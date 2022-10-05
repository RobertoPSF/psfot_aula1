import java.util.ArrayList;
import java.util.List;

public class ProdRep {

    private List<Produto> produtos = new ArrayList<Produto> ();

    public void salvarProduto(Produto p){
        produtos.add(p);
    }
    
    public List<Produto> lerProduto(){
        return produtos;
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
