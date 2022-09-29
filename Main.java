public class Main {
    public static void main(String[] args){

        Produto bicicleta = new Produto("Bicicleta", "Monark", 1500.00);
        Lote lote_bicicleta = new Lote(50, "28/09/2027", bicicleta);

        System.out.println(bicicleta);
        System.out.println(lote_bicicleta);

    }
}
