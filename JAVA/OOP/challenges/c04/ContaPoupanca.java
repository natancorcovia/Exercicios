package JAVA.OOP.challenges.c04;

public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    private double taxaDeRendimento;

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }
    
    public void renderJuros(){
        double montante = getSaldo() * (1+taxaDeRendimento/100);
        setSaldo(montante);
    }
}
