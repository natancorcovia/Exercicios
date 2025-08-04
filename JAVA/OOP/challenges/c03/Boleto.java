package JAVA.OOP.challenges.c03;

class Boleto implements MetodoPagamento {
    @Override
    public void pagar(double valor){
        System.out.println("Valor do boleto: R$" + valor);
    }

    @Override
    public String getTipo() {
        return "Boleto";
    }
}
