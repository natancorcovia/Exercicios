package JAVA.OOP.challenges.c03;

class CartaoCredito implements MetodoPagamento {

    @Override
    public void pagar(double valor){
        System.out.println("Valor a ser pago no crédito: R$" + valor);
    }

    @Override
    public String getTipo() {
        return "Cartão de Crédito";
    }
}
