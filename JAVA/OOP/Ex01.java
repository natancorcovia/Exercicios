package JAVA.OOP;

public class Ex01 {
    private String nome;
    private double preco;

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setNome( String novoNome){
        nome = novoNome;
    }

    public void setPreco( double novoPreco){
        if(novoPreco > 0){
           preco = novoPreco;
        };
    }

    public void exibirInformacoes(){
        System.out.println("Produto: " + nome + " - Preço: R$" + preco);
    }
}

// PARA TESTAR:
// public class Main {
//     public static void main(String[] args) {
//         Ex01 produto = new Ex01();
//         produto.setNome("Camiseta");
//         produto.setPreco(59.90);

//         produto.exibirInformacoes();
//     }
// }
