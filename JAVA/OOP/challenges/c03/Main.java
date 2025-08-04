package JAVA.OOP.challenges.c03;

public class Main {
    public static void main(String[] args) {
        MetodoPagamento[] metodos = {
            new CartaoCredito(),
            new Boleto(),
            new Pix()
        };

        for (MetodoPagamento metodo : metodos) {
            Pagamento pagamento = new Pagamento(metodo, 150.0);
            pagamento.processar();
            pagamento.mostrarValor();
            System.out.println();
        }
    }
}