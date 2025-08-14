package JAVA.OOP.challenges.c05;

public class Main {
    public static void main(String[] args) {
        Produto camiseta = new Produto("Camista", 79.90);
        Produto bermuda = new Produto("Bermuda", 49.90);
        Produto bone = new Produto("Boné", 39.90);

        Pedido pedido1 = new Pedido(1);
        pedido1.adicionarProduto(camiseta);
        pedido1.adicionarProduto(bone);

        Pedido pedido2 = new Pedido(2);
        pedido2.adicionarProduto(bermuda);

        Cliente cliente1 = new Cliente("Natan");
        cliente1.fazerPedido(pedido1);
        cliente1.fazerPedido(pedido2);

        cliente1.verHistorico();


    }
}
