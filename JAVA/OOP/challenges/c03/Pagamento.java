package JAVA.OOP.challenges.c03;

class Pagamento extends Transacao{
    private MetodoPagamento metodoPagamento;
    private double valor;

    public Pagamento (MetodoPagamento metodoPagamento , double valor){
        this.metodoPagamento = metodoPagamento;
        setValor(valor);
    }

    @Override
    public void processar() {
        System.out.println("Processando pagamento via: " + metodoPagamento.getTipo());
        metodoPagamento.pagar(getValor());
    }
}
