package JAVA.OOP.classes.Ex02;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Criar um produto
        Produto p1 = new Produto();
        p1.setNome("Notebook");
        p1.setPreco(3500.00);
        p1.setQuantidadeEmEstoque(45);

        // Exibir informações iniciais
        p1.exibirInformacoes();

        // Comprar mais unidades
        System.out.println("\nComprando mais unidades...");
        p1.comprarProduto(10);
        p1.exibirInformacoes();

        // Vender unidades
        System.out.println("\nVendendo algumas unidades...");
        p1.venderProduto(20);
        p1.exibirInformacoes();

        // Tentativa de vender mais do que tem
        System.out.println("\nTentando vender quantidade acima do estoque...");
        p1.venderProduto(100);

        // Exibir preço formatado separadamente
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        System.out.println("\nPreço: " + nf.format(p1.getPreco()));
    }
}
