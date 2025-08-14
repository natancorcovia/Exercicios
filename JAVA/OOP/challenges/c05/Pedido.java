package JAVA.OOP.challenges.c05;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private List<Produto> produtos;
    
    public int getNumeroPedido() {
        return numeroPedido;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.produtos = new ArrayList<>();
    }
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Adicionado ao pedido " + numeroPedido);
    }

    public double calcularTotal(){
        double total = 0.0;
        for (Produto produto : produtos){
            total = produto.getPreco();
        }
        return total;
    }

    public void listarProdutos(){
        System.out.println("Produtos do pedido #" + numeroPedido + ":");
        for(Produto produto : produtos){
            System.out.println("- "+ produto.getNome() + " | R$" + produto.getPreco());
        }
    }
}
