package JAVA.OOP.challenges.c05;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Pedido> pedidos;
    
    public String getNome() {
        return nome;
    }
    public List<Pedido> getPedidos() {
        return pedidos;
    }
    
    public Cliente(String nome) {
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    public void fazerPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void verHistorico(){
        System.out.println("Historico de pedidos de " + nome + ":");
        if(pedidos.isEmpty()){
            System.out.println("Nenhum pedido realizado.");
        }else{
            for(Pedido pedido : pedidos){
            System.out.println("\nPedido #" + pedido.getNumeroPedido() + " | Total: R$ " + pedido.calcularTotal());
                pedido.listarProdutos();
        }
        }
    }
}
