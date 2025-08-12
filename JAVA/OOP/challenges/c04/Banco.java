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

    // TODO: metodo transferir(String numeroOrigem, String numeroDestino, double valor)

    public void listarContas(){
        for(Conta conta : contas){
            conta.exibirInformacoes();
        }
    }

}
