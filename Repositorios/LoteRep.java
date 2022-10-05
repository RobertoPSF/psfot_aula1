package Repositorios;
import java.util.HashMap;
import java.util.Map;

import Classes.Lote;
import Classes.Produto;

public class LoteRep {

    private Map<String, Lote> lotes = new HashMap<> ();
    
    public void salvarLote(Produto p, Lote l){
        lotes.put(p.getNome(), l);
    }

    public Map<String, Lote> lerLote(){
        return lotes;
    }

    public void atualizarLote(){}

    public void exlcuirLote(){}
}
