package JAVA.OOP.challenges.c04;

public class ContaPoupanca extends Conta {
    private double taxaDeRendimento;

    public ContaPoupanca(String numero, String titular, double saldo , double taxaDeRendimento) {
        super(numero, titular, saldo);
        setTaxaDeRendimento(taxaDeRendimento);
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }
    
    public void renderJuros(){
        double montante = getSaldo() * (1+taxaDeRendimento/100);
        double rendimento = montante - getSaldo();
        setSaldo(montante);
        System.out.println("Sua conta rendeu: R$" + String.format("%.2f", rendimento) + " este mês.");
    }
}
