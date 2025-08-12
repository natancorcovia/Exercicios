package JAVA.OOP.challenges.c04;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, String titular, double saldo, double limiteChequeEspecial) {
        super(numero, titular, saldo);
        setLimiteChequeEspecial(limiteChequeEspecial);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        double saldoDisponivel = getSaldo() + getLimiteChequeEspecial();

        if (valor <= saldoDisponivel) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
            System.out.println("Saque efetuado com sucesso!");
            if (novoSaldo < 0) {
                System.out.println("Você está no cheque especial.");
            }
        } else {
            System.out.println("Limite insuficiente.");
        }
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
