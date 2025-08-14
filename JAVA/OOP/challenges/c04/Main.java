package JAVA.OOP.challenges.c04;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente conta1 = new ContaCorrente("001" , "Natan" , 1000.0 , 500.0);
        ContaCorrente conta2 = new ContaCorrente("002" , "Beatriz" , 800.0 , 300.0);
        ContaPoupanca conta3 = new ContaPoupanca("123" , "Natan" , 5653.0 , 13);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        banco.adicionarConta(conta3);

        // conta3.renderJuros();

        // conta1.exibirInformacoes();
        // conta2.exibirInformacoes();
        // banco.transferir("001" , "002" , 300);
        // conta1.exibirInformacoes();
        // conta2.exibirInformacoes();

        // banco.listarContas();
    }
};