package JAVA.OOP;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {


        var scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Ver cheque especial");
        System.out.println("3 - Depositar dinheiro");
        System.out.println("4 - Sacar dinheiro");
        System.out.println("5 - Pagar um boleto");
        System.out.println("6 - Verificar uso do cheque especial");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> consultaSaldo();
            case 2 -> consultaChequeEspecial();
            case 3 -> deposito();
            case 4 -> saque();
            case 5 -> pagarBoleto();
            case 6 -> verificarChequeEspecial();
        
            default -> System.out.println("Opção inválida.");
        }
        scanner.close();
    }

    public static void consultaSaldo(){
            System.out.println("Seu saldo é de: R$ ");
        }

    public static void consultaChequeEspecial(){
            System.out.println("Seu cheque especial é de R$ ");
        }

    public static void deposito(){
            System.out.println("Depositar dinheiro");
        }

    public static void saque(){
            System.out.println("Sacar dinheiro");
        }

    public static void pagarBoleto(){
            System.out.println("Pagar um boleto");
        }

    public static void verificarChequeEspecial(){
            System.out.println("Verificar uso do cheque especial");
        }
}


// Escreva um código onde temos uma conta bancária que possa realizar as seguintes operações:
// Consultar saldo

// Consultar cheque especial

// Depositar dinheiro

// Sacar dinheiro

// Pagar um boleto

// Verificar se a conta está usando cheque especial

// Siga as seguintes regras para implementar:
// A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;

// O valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;

// Se o valor depositado na criação da conta for de R$500,00 ou menos, o cheque especial deve ser de R$50,00;

// Para valores acima de R$500,00, o cheque especial deve ser de 50% do valor depositado;

// Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.
