public class Servico{
    public static void main(String[] args){

        Fachada fachada = new Fachada();

        fachada.criarProduto("Cuscuz", "Vitamilho", 1.50);
        fachada.criarLote(1000, "05/10/2023", "Cuscuz");
        fachada.lerProdutos();
        fachada.lerLote();
        fachada.atualizarProduto("Cuscuz","Vitamilho", 2.50);
        fachada.atualizarLote();
        fachada.excluirProduto("Cuscuz", "Vitamilho", 2.50);
        fachada.excluirLote();
        fachada.lerProdutos();
        fachada.lerLote();
        
    }
}