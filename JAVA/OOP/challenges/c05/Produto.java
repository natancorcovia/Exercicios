package JAVA.OOP.challenges.c05;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    
}
