package JAVA.OOP.encapsulation.Ex01;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setTitular( String novoTitular){
        titular = novoTitular;
    }

    public void depositar( double valor){
        if(valor > 0){
           saldo = saldo + valor;
        }
    }

    public void sacar(double valor){
    if(valor > 0 && valor <= saldo){
        saldo = saldo - valor;
    } else {
        System.out.println("Saque inválido: valor maior que o saldo ou negativo.");
    }
}
}
