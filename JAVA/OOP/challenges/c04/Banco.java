package JAVA.OOP.challenges.c04;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas;

    public Banco() {
    contas = new ArrayList<>(); 
}
    public void adicionarConta(Conta conta) {
    contas.add(conta);
}
    
    public Conta buscarConta(String numero){
        for (Conta conta : contas ){
            if(conta.getNumero().equals(numero)){
                return conta;
            }
        }
    return null;
    }

    public void transferir(String numeroOrigem , String numeroDestino, double valor){
        Conta contaOrigem = null;
        Conta contaDestino = null;

        // Encontrar conta pelo numero:
        for(Conta conta : contas){
            if(conta.getNumero().equals(numeroOrigem)){
                contaOrigem = conta;
            } else if(conta.getNumero().equals(numeroDestino)) {
                contaDestino = conta;
            }
        }

        // Verificar se as contas existem:
        if (contaOrigem == null){
            System.out.println("Conta de origem não encontrada.");
            return;
        }
        if (contaDestino == null){
            System.out.println("Conta de destino não encontrada.");
            return;
        }
    
        // Faz a transferencia:
        if(contaOrigem.getSaldo()>= valor){
            contaOrigem.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso!");
        } else{
        System.out.println("Saldo insuficiente na conta de origem.");
        }
    }

    public void listarContas(){
        for(Conta conta : contas){
            conta.exibirInformacoes();
        }
    }

}
