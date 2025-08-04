package JAVA.OOP.challenges.c03;

abstract class Transacao {
    private double valor;

    public double getValor(){
        return valor;
    }

    public void SetValor(double novoValor){
        valor = novoValor;
    }

    public void mostrarValor(){
        System.out.println("Valor da transação: R$" + valor);
    }

    public abstract void processar();
}
