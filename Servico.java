public class Servico{
    public static void main(String[] args){

        Fachada fachada = new Fachada();

        fachada.criarProduto("Cuscuz", "Vitamilho", 1.50);
        fachada.criarLote();
        fachada.lerProdutos();
        fachada.lerLote();
        /*fachada.atualizarProduto("Cuscuz","Vitamilho", 2.50);
        fachada.excluirProduto("Cuscuz", "Vitamilho", 2.50);
        fachada.lerProdutos();*/
        
    }
}