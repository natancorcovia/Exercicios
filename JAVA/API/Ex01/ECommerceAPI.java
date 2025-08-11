package JAVA.API.Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ECommerceAPI {

    static class Produto {
        String nome;
        double preco;
        int quantidadeEmEstoque;

        public Produto(String nome, double preco, int quantidadeEmEstoque) {
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int n = scanner.nextInt();
        scanner.nextLine();  

        String linha = scanner.nextLine();

        // Crie a lista para armazenar os produtos:
        List<Produto> produtos = new ArrayList<>();

        String[] partes = linha.split(",\\s*");

        // Implemente loop para percorrer a lista de partes, processando as informações de cada produto:
        for (int i = 0; i < partes.length; i += 3) {
            String nome = partes[i].trim();
            double preco = Double.parseDouble(partes[i + 1].trim());
            int quantidadeEmEstoque = Integer.parseInt(partes[i + 2].trim());

            // Adicione o produto na lista:
            produtos.add(new Produto(nome, preco, quantidadeEmEstoque));
        }

        // Crie a lista para armazenar os produtos com mais de 50 unidades em estoque:
        List<Produto> produtosMaisDe50 = new ArrayList<>();

        // Filtre os produtos com mais de 50 unidades em estoque:
        for (Produto p : produtos) {
            if (p.quantidadeEmEstoque > 50) {
                produtosMaisDe50.add(p);
            }
        }

        // Exiba os nomes dos produtos com mais de 50 unidades em estoque:
        List<String> nomes = new ArrayList<>();
        for (Produto p : produtosMaisDe50) {
            nomes.add(p.nome);
        }
        System.out.println(String.join(", ", nomes));
        
        scanner.close();
    }
}
