package JAVA.OOP.challenges.c04;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Conta {
    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
    
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        if(titular != null && !titular.trim().isEmpty()){
            this.titular = titular;
        } else {
            System.out.println("Nome inválido.");
        }
    }
    
    public double getSaldo() {
            return saldo;
    }
    
    public void setSaldo(double saldo) {
        if(saldo >= 0){
            this.saldo=saldo;
        } else {
            System.out.println("O saldo não pode ser negativo.");
        }
    }
    
    public void depositar(double valor){
        if(valor > 0){
            setSaldo(getSaldo() + valor);
        }else{
            System.out.println("O deposito mínimo é de R$1,00");
        }
    }

    public void sacar(double valor){
        if(valor > 0 && valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
            System.out.println("Saque efetuado com sucesso!");
        } else {
           System.out.println("Saldo insuficiente."); 
        }
    }

    public void exibirInformacoes(){
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        System.out.println("Conta: " + getNumero() + "; Titular: " + getTitular() + " Saldo atual: " + nf.format(getSaldo()));
    }

    public Conta(String numero, String titular, double saldo) {
        setNumero(numero);
        setTitular(titular);
        setSaldo(saldo);
    }
}

