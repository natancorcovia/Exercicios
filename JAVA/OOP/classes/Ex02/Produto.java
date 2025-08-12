package JAVA.OOP.classes.Ex02;

import java.text.NumberFormat;
import java.util.Locale;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço não pode ser negativo.");
        }
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque >= 0) {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        } else {
            System.out.println("Quantidade em estoque não pode ser negativa.");
        }
    }

    public void comprarProduto(int quantidade){
        if (quantidade > 0) {
            setQuantidadeEmEstoque(getQuantidadeEmEstoque() + quantidade);
        } else {
            System.out.println("Quantidade inválida para compra.");
        }
    }

    public void venderProduto(int quantidade){
        if (quantidade > 0 && quantidade <= getQuantidadeEmEstoque()) {
            setQuantidadeEmEstoque(getQuantidadeEmEstoque() - quantidade);
        } else {
            System.out.println("Venda inválida: quantidade insuficiente ou negativa.");
        }
    }

    public void exibirInformacoes(){
        if(getQuantidadeEmEstoque() > 0 && getQuantidadeEmEstoque() <= 50){
            System.out.println("Temos " + getQuantidadeEmEstoque() + " unidades de " + getNome() + " em estoque, considere abastecer o estoque." );
        }else if(getQuantidadeEmEstoque() > 50){
            System.out.println("Temos " + getQuantidadeEmEstoque() + " unidades de " + getNome() + " em estoque, estamos bem abastecidos." );
        } else{
            System.out.println("Não temos nenhuma unidade de " + getNome() + " disponível em estoque." );
        }
    }

    public void exibirPreco() {
    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
    System.out.println("Preço: " + nf.format(getPreco()));
}
}
